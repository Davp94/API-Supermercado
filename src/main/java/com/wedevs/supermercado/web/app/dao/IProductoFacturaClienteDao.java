package com.wedevs.supermercado.web.app.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.format.annotation.DateTimeFormat;

import com.wedevs.supermercado.web.app.DTOs.facturaDTO;
import com.wedevs.supermercado.web.app.DTOs.facturaMasProductosDTO;
import com.wedevs.supermercado.web.app.DTOs.productoMasVevndidoDTO;
import com.wedevs.supermercado.web.app.models.Factura;
import com.wedevs.supermercado.web.app.models.Producto;
import com.wedevs.supermercado.web.app.models.ProductoFacturaCliente;

public interface IProductoFacturaClienteDao extends CrudRepository<Producto, Integer>{
	
	
	
	//9. Obtener los productos mas vendidos de la semana
	//añadir DTO
	@Query(value="select p.*\r\n" + 
			"from producto p, (select pf.producto_id_producto id_producto, sum(cantidad) cantidad\r\n" + 
			"				 from producto_factura_cliente pf\r\n" + 
			"				 where pf.factura_id_factura IN (select id_factura  \r\n" + 
			"												from factura\r\n" + 
			"												where fecha between ?1 and current_date)\r\n" + 
			"				 group by pf.producto_id_producto)ventas\r\n" + 
			"where p.id_producto = ventas.id_producto\r\n" + 
			"order by ventas.cantidad desc", nativeQuery=true)
	List<Producto> productosMasVendidos(@DateTimeFormat(pattern = "dd-MM-yyyy") Date fecha);
	

	
	//11. listar las facturas del cliente x que tengan mas productos en el rango de fecha (a,b)
	@Query(value="select f.*\r\n" + 
			"from factura f, (select cliente_ci, sum(cantidad)cantidad, factura_id_factura\r\n" + 
			"				from producto_factura_cliente\r\n" + 
			"				group by cliente_ci, factura_id_factura)productos\r\n" + 
			"where f.fecha between ?1 and ?2\r\n" + 
			"and f.id_factura= productos.factura_id_factura\r\n" + 
			"and productos.cliente_ci like ?3\r\n" + 
			"order by productos.cantidad desc", nativeQuery=true)
	List<Factura> facturasConMasProductos(Date fechaA, Date fechaB, String ci);

}
