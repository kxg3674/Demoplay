package com.human.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AController {

	@GetMapping("/test")
	public String abc() {
		return "test";
	}
}
