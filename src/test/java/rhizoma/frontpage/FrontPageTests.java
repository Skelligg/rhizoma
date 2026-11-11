package rhizoma.frontpage;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.assertj.MockMvcTester;

import rhizoma.TestcontainersConfiguration;

@SpringBootTest
@AutoConfigureMockMvc
@Import(TestcontainersConfiguration.class)
class FrontPageTests {

	@Autowired
	MockMvcTester mvc;

	@Test
	void outsiderCanReadTheFrontPage() {
		assertThat(mvc.get().uri("/")).hasStatusOk().bodyText().contains("rhizoma");
	}

}
