package com.wedevs.supermercado.web.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.Cliente;
import com.wedevs.supermercado.web.app.models.Promocion;
import com.wedevs.supermercado.web.app.models.PromocionProductoFactura;

public interface IPromocionProductoDao extends CrudRepository<PromocionProductoFactura, Integer>{

	//1. Lista de clientes que en total de compras tienen mas de x monto
	@Query(value="select c.*\r\n" + 
			"from cliente c, (select id_cliente, sum(precio) precio\r\n" + 
			"				 from promocion_producto_factura\r\n" + 
			"				 group by id_cliente) totalA, (select cliente_ci, sum(precio) precio\r\n" + 
			"											   from producto_factura_cliente \r\n" + 
			"											   group by cliente_ci) totalB\r\n" + 
			"where totalA.precio + totalB.precio >= ?1 \r\n" + 
			"and c.ci = totalA.id_cliente\r\n" + 
			"and c.ci = totalB.cliente_ci", nativeQuery=true)
	List<Cliente> clienteConMasCompras(double monto); 
	
	//5. Obtener todas las promociones donde esté el producto X
	@Query(value="	select prom.*\r\n" + 
			"from promocion prom , (select id_promocion, id_producto\r\n" + 
			"					   from promocion_producto_factura) proms\r\n" + 
			"where prom.id_promocion = proms.id_promocion\r\n" + 
			"and proms.id_producto LIKE ?1", nativeQuery=true)
	List<Promocion> promocionConProducto(String idProducto);
	
	//6. Obtener la promocion mas comprada
	@Query(value="select prom.*\r\n" + 
			"from promocion prom, (select MAX(maxim.precio)\r\n" + 
			"					 from (select id_promocion, sum(precio) precio\r\n" + 
			"						  from promocion_producto_factura\r\n" + 
			"						  group by id_promocion)maxim)maximo,(select id_promocion, sum(precio) precio\r\n" + 
			"						  								from promocion_producto_factura\r\n" + 
			"						  								group by id_promocion)sumas\r\n" + 
			"where sumas.id_promocion = prom.id_promocion\r\n" + 
			"and maximo.max = sumas.precio", nativeQuery=true)
	List<Promocion> promocionMasComprada();
	
	
	
}
