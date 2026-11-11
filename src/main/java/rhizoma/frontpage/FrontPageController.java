package rhizoma.frontpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class FrontPageController {

	@GetMapping("/")
	String frontPage() {
		return "frontpage";
	}

}
