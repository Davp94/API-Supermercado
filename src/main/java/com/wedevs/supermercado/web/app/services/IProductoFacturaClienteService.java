package com.wedevs.supermercado.web.app.services;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.format.annotation.DateTimeFormat;

import com.wedevs.supermercado.web.app.DTOs.facturaDTO;
import com.wedevs.supermercado.web.app.DTOs.facturaMasProductosDTO;
import com.wedevs.supermercado.web.app.DTOs.productoMasVevndidoDTO;
import com.wedevs.supermercado.web.app.models.Factura;
import com.wedevs.supermercado.web.app.models.Producto;

public interface IProductoFacturaClienteService {
	
		//8. listar las facturas con mas productos del ultimo mes 
		//añadir DTO
		
		List<Factura> facturaConMasProductos(Date fecha);
		
		//9. Obtener los productos mas vendidos de la semana
		//añadir DTO
		
		List<Producto> productosMasVendidos(@DateTimeFormat(pattern = "dd-MM-yyyy") Date fecha);
		
		//11. listar las facturas del cliente x que tengan mas productos en el rango de fecha (a,b)
		//Añadir DTO
		List<Factura> facturasConMasProductos(Date fechaA, Date fechaB, String ci);

}
