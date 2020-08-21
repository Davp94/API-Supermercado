package com.wedevs.supermercado.web.app.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.ProductoCarritoCliente;

public interface IProductoCarritoClienteDao extends CrudRepository<ProductoCarritoCliente, Integer> {

	//7. el estado del producto x  en el carrito
	@Query(value="select estado\r\n" + 
			"from producto_carrito_cliente\r\n" + 
			"where producto_id_producto like ?1", nativeQuery=true)
	String estadoCarritoProducto(String idProducto);
	
}
