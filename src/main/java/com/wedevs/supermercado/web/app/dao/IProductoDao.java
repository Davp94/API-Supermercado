package com.wedevs.supermercado.web.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.Producto;

public interface IProductoDao extends CrudRepository<Producto, String>{
	
	//con jpa
	List<Producto> findByDescripcionLike(String descripcion);
	
	//con jpql
	@Query("select p from producto p where descripcion LIKE ?1")
	List<Producto> productosPorDescripcion(String descripcion);
	
	//con sql nativo
	@Query(value="select * from producto where descripcion LIKE ?1", nativeQuery=true)
	List<Producto> productosPorDescripcionconSql(String descripcion);

	
}
