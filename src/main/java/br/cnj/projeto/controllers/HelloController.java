package br.cnj.projeto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//The class is flagged as a @RestController, meaning it is ready for use by Spring MVC to handle web requests.
//@RestController combines @Controller and @ResponseBody, two annotations that results in web requests returning data rather than a view.
@RestController
public class HelloController {
//@GetMapping maps / to the index() method.
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}