package com.wedevs.supermercado.web.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wedevs.supermercado.web.app.DTOs.productosDTO;
import com.wedevs.supermercado.web.app.models.Persona;
import com.wedevs.supermercado.web.app.models.Producto;
import com.wedevs.supermercado.web.app.services.IPersonaService;
import com.wedevs.supermercado.web.app.services.IProductoService;

@RestController
@RequestMapping("/supermercado")
public class ProductoRestController {
	
	@Autowired 
	public IProductoService productoService;
	
	//hola mundo
	@GetMapping("/hola")
	public String holaMundo() {
		return "HOla mundo en Spring";
	}
	
	@GetMapping("/producto/Descripcion/{descripcion}")
	public List<Producto> productosPorDescripcion(@PathVariable String descripcion) {
		
		return (List<Producto>)productoService.productosPorDescripcion(descripcion);
	}

	@GetMapping("/producto/agotados/{cantidad}")
	public List<Producto> productosAgotados(@PathVariable int cantidad) {
		
		return (List<Producto>)productoService.productosAgotados(cantidad);
	}

	@GetMapping("/producto/porExpirar")
	public List<Producto> productosPorExpirar() {
		
		return (List<Producto>)productoService.productosPorExpirar();
	}
	
	
	

}
