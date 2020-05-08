package com.wedevs.supermercado.web.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.ProductoFacturaCliente;

public interface IProductoFacturaClienteDao extends CrudRepository<ProductoFacturaCliente, Integer>{

}
