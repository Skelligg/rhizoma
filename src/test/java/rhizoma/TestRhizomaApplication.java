package rhizoma;

import org.springframework.boot.SpringApplication;

/**
 * Runs the application locally against a throwaway PostgreSQL container:
 * {@code ./gradlew bootTestRun}.
 */
public class TestRhizomaApplication {

	public static void main(String[] args) {
		SpringApplication.from(RhizomaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
