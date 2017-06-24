package com.stackoverflow.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnyController {

	@GetMapping(path = "/")
	public String home() {
		return "home";
	}
}
