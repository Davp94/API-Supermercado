package com.wedevs.supermercado.web.app.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.Factura;

public interface IFacturaDao extends CrudRepository<Factura, String>{
	
	//8. listar las facturas con mas productos del ultimo mes 
		//añadir DTO
		@Query(value="select f.*\r\n" + 
				"from producto_factura_cliente pf, factura f\r\n" + 
				"where f.fecha between ?1 and current_date\r\n" + 
				"and f.id_factura = pf.factura_id_factura\r\n" + 
				"limit 2", nativeQuery=true)
		List<Factura> facturaConMasProductos(Date fecha);

}
