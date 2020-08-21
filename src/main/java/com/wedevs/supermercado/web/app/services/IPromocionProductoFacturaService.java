package com.wedevs.supermercado.web.app.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.wedevs.supermercado.web.app.models.Cliente;
import com.wedevs.supermercado.web.app.models.Promocion;

public interface IPromocionProductoFacturaService {
	
		//1. Lista de clientes que en total de compras tienen mas de x monto
		
		List<Cliente> clienteConMasCompras(double monto); 
		
		//5. Obtener todas las promociones donde esté el producto X
		
		List<Promocion> promocionConProducto(String idProducto);
		
		//6. Obtener la promocion mas comprada
		
		List<Promocion> promocionMasComprada();

}
