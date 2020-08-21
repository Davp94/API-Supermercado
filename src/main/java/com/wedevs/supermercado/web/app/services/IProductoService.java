package com.wedevs.supermercado.web.app.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.wedevs.supermercado.web.app.DTOs.productosDTO;
import com.wedevs.supermercado.web.app.models.Producto;

public interface IProductoService {
	
	// 2. Listar productos que sean importados
	List<Producto> productosPorDescripcion(String descripcion);
	
	// 4. Lista productos agotados y con stock crítico (< x total)
	List <Producto> productosAgotados(int cantidad);
	
	//10. lista de productos por expirar
	List <Producto> productosPorExpirar();

}
