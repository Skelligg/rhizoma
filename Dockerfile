# Build stage: compiles the application into one runnable jar.
# Tests are not run here. They run in the pipeline before any release.
FROM eclipse-temurin:25-jdk AS build
WORKDIR /workspace
COPY gradlew settings.gradle.kts build.gradle.kts ./
COPY gradle gradle
RUN ./gradlew --no-daemon dependencies > /dev/null
COPY src src
RUN ./gradlew --no-daemon bootJar

# Run stage: only the Java runtime and the jar, running as an unprivileged user.
FROM eclipse-temurin:25-jre
RUN useradd --system --no-create-home rhizoma
WORKDIR /app
COPY --from=build /workspace/build/libs/*.jar app.jar
USER rhizoma
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
