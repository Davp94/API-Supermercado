package com.wedevs.supermercado.web.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoRestController {
	
	@GetMapping("/hola")
	public String holaMundo() {
		return "HOla mundo en Spring";
	}

}
