package org.springframework.boot.SpringBootApp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpringBootAppController {
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}