package com.wedevs.supermercado.web.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.ProductoCarritoCliente;

public interface IProductoCarritoClienteDao extends CrudRepository<ProductoCarritoCliente, Integer> {

}
