# Architecture

This is a short record of how rhizoma is built and why. The full list of decisions, including the product rules, is in [`DECISIONS.md`](../DECISIONS.md).

## The whole system

Two programs run the site: the application and a PostgreSQL database. A third, Caddy, sits in front as the only program exposed to the internet.

```
reader ──HTTPS──> Caddy ──> application (Spring Boot) ──> PostgreSQL
```

There is no separate search engine, cache store or message queue. PostgreSQL's text search covers search, sessions are stored in PostgreSQL, cached pages and rate limits live in the application's memory, and background work runs from a job table. A separate service is added only when measured load demands it.

**Why:** one person runs this site. Every extra program is something more to install, secure, update, back up and debug.

## Server-rendered pages

The server sends complete HTML pages, built with Thymeleaf templates. Small JavaScript additions (htmx) make some actions smoother. Every page works without JavaScript. There is no browser-side application framework.

**Why:** the site is mostly text and images being read. Complete pages are read directly by search engines, are cheap to cache for logged-out readers, work on old devices, and depend on little that changes over the years.

## Java and Spring Boot

**Why:** the owner reads Java and Spring most fluently, and the owner's job is to judge and debug the code. The compiler also catches a class of mistakes before the code runs.

Known costs: there is no ready-made admin site and the account flows are built by hand, so there is more code than a framework made for content sites would need.

## A modular monolith

The application is one program, divided into sections by feature. Each section is a package directly under `rhizoma`:

```
rhizoma
├── frontpage      the front page
└── ...            one package per feature, added as the build order reaches it
```

A section exposes a small surface to the others. Classes are package-private unless another section needs them. Spring Modulith checks these borders in `ModularityTests`, so a section that reaches into another's internals fails the build.

**Why:** the site is built in waves. Enforced borders keep each new wave from tangling the existing code, and let a reader audit one section alone. Microservices would add network failures, split database transactions and many deployments, to solve problems that many teams have and one maintainer does not.

## Database

PostgreSQL, accessed through Spring Data JPA. The schema is owned by Flyway: every change is a versioned script in `src/main/resources/db/migration`. Hibernate only checks that the entities match the schema.

## Tests

- Tests are written before the code.
- Tests run against a real PostgreSQL started in a container by Testcontainers, never an in-memory substitute.
- Every page and action has tests for each kind of visitor, asserting what that visitor may see.
- `ModularityTests` checks the borders between sections.

## Deployment

The files in `deploy/` describe the production stack as containers: Caddy, the application and PostgreSQL. The same description runs on a laptop and on the server, so the site can be moved to another provider by copying the files and the data.

Caddy obtains and renews the HTTPS certificate on its own, passes requests to the application, and blocks the application's internal health check from outside.

Tests run automatically on each pull request. A release to the server is a manual step by the owner.

## Independence rules that shape the code

- Nothing from a third party is loaded into the reader's browser: no external scripts, fonts, analytics or embedded players.
- Accounts are the site's own. There is no sign-in through another company.
- Secrets and private configuration (passwords, keys, reputation thresholds, anti-abuse values) never enter the repository.
