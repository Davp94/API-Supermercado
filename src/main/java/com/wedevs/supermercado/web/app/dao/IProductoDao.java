package com.wedevs.supermercado.web.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.Producto;

public interface IProductoDao extends CrudRepository<Producto, String>{

}
