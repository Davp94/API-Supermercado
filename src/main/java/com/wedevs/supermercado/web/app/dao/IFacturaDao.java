package com.wedevs.supermercado.web.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.Factura;

public interface IFacturaDao extends CrudRepository<Factura, String>{

}
