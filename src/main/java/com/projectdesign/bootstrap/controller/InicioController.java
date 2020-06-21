package com.projectdesign.bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/inicio") // Define a raiz do controller evitando repeticao de codigo 
public class InicioController {
	
	@RequestMapping()
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("Index");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("TelaLogin");
		return mv;
	}
	
}
