package com.stackoverflow.springmvc.web.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;

@ControllerAdvice
public class CategoriesAdvice {

	@ModelAttribute
	public void addAttributes(Model model) {
		model.addAttribute("categories", Arrays.asList("1","2","3"));
	}
}
