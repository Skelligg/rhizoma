# rhizoma

An independent community site for fashion as a creative act.

rhizoma is small, slow and self-hosted. It carries no advertising and no trackers, and nothing buys entry or standing. The code is open so that members can check how the site works, and so that others can run their own.

The project is at its beginning. What exists so far is the skeleton of the application.

## Documents

- [`DECISIONS.md`](DECISIONS.md): what has been decided, and the order things are built in.
- [`docs/architecture.md`](docs/architecture.md): how the code is organised.

## Running it

You need Java 21 or newer (the build downloads Java 25 itself) and Docker.

```
./gradlew test       # run the tests
./gradlew bootRun    # run the site at http://localhost:8080
```

To run the full stack as it runs on a server, with Caddy in front:

```
cp deploy/.env.example deploy/.env    # then fill in the values
docker compose -f deploy/compose.yaml --env-file deploy/.env up -d --build
```

## Licence

[GNU Affero General Public License, version 3](LICENSE). If you run a modified version of rhizoma as a website, you must make your changes available to its users.
