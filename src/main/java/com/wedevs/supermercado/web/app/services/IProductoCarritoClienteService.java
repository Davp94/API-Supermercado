package com.wedevs.supermercado.web.app.services;

import org.springframework.data.jpa.repository.Query;

public interface IProductoCarritoClienteService {
	
	//7. el estado del producto x  en el carrito	
	String estadoCarritoProducto(String idProducto);
	

}
