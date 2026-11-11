package rhizoma;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

/**
 * Fails the build when one section of the application reaches into another section's
 * internals.
 */
class ModularityTests {

	@Test
	void sectionsOnlyUseEachOthersDeclaredSurface() {
		ApplicationModules.of(RhizomaApplication.class).verify();
	}

}
