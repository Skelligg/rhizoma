# rhizoma

An independent, open source community site for fashion as a creative act. One owner oversees the build; Claude Code writes most of the code and the owner reviews every change.

Read these before planning any work:

- `DECISIONS.md`: every product and technical decision, and the build order. It is the source of truth. If a task conflicts with it, stop and ask the owner.
- `docs/architecture.md`: how the code is organised and why.

## Where the project is

The site is built in stages (see "Build order" in `DECISIONS.md`). Build only what the current stage lists. Features that are decided but belong to a later wave are not to be built early, and their data model is not to be prepared "just in case".

## Stack

Java 25, Spring Boot 4, Thymeleaf, PostgreSQL, Flyway, Spring Modulith, Gradle. htmx for small interactions when a feature first needs it. No browser-side application framework and no build step for front-end code.

## Rules for every change

1. **Test first.** Write the test that describes the wanted behaviour, watch it fail, then write the code.
2. **Real database.** Tests that load the application import `TestcontainersConfiguration` and run against real PostgreSQL. Do not add an in-memory database.
3. **Access rules are tested completely.** Every page and every action has tests for each kind of visitor that exists at the current stage (outsider, member, moderator, owner), asserting exactly what the "What is public" section of `DECISIONS.md` allows. A new page without these tests is not done.
4. **Section borders.** Code is organised by feature under `rhizoma.<section>`. Classes are package-private unless another section needs them. `ModularityTests` must pass.
5. **Schema changes go through Flyway.** Add a new versioned script in `src/main/resources/db/migration`. Never edit a script that has been merged.
6. **Nothing from third parties reaches the reader's browser.** No external scripts, fonts, styles, analytics or embedded players. Assets are served from this application. Outside media loads only after a click.
7. **Pages work without JavaScript.** JavaScript adds convenience and never carries a feature alone.
8. **No secrets in the repository.** Passwords, keys, reputation thresholds and anti-abuse values come from environment variables or private configuration files that are listed in `.gitignore`.
9. **No extra services.** The site is the application and PostgreSQL. Do not add Redis, a search engine or a message queue; `DECISIONS.md` says what covers those jobs.

## How work is delivered

- Small pull requests: one feature or fix each, with a description of what changed and why.
- A larger change is a feature branch that collects small pull requests and then merges into `main` as a whole.
- The owner approves every pull request. Do not merge, and do not deploy. A release to the server is the owner's manual step.
- Commit and push only when the owner asks.

## Commands

- `./gradlew test`: run all tests. Needs Docker running.
- `./gradlew bootRun`: run the application locally. Starts the development database from `compose.yaml`.
- `./gradlew bootTestRun`: run locally against a throwaway database container.
- `docker compose -f deploy/compose.yaml --env-file deploy/.env up -d --build`: run the full production stack (Caddy, application, PostgreSQL).

## Writing

Text that people read (pages, emails, documentation, pull request descriptions) is plain English in full sentences. The site is in English only.
