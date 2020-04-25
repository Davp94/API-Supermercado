package com.wedevs.supermercado.web.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedevs.supermercado.web.app.models.Persona;
import com.wedevs.supermercado.web.app.services.IPersonaService;

@RestController
public class ProductoRestController {
	
	@Autowired
	public IPersonaService personaService;
	
	@GetMapping("/hola")
	public String holaMundo() {
		return "HOla mundo en Spring";
	}
	
	@GetMapping("/supermercado/personas")
	public List<Persona> Personas() {
		return personaService.findAll();
	}
	
	

}
