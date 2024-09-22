package spring.mvc.sakila.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/")
	public String main() {
		logger.info("This is logger for Index Page");
		logger.debug("This is logger for Index Page");
		return "index";
	}
}