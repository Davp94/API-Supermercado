package com.wedevs.supermercado.web.app.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import com.wedevs.supermercado.web.app.DTOs.facturaDTO;
import com.wedevs.supermercado.web.app.DTOs.facturaMasProductosDTO;
import com.wedevs.supermercado.web.app.DTOs.productoMasVevndidoDTO;
import com.wedevs.supermercado.web.app.dao.IFacturaDao;
import com.wedevs.supermercado.web.app.dao.IProductoFacturaClienteDao;
import com.wedevs.supermercado.web.app.models.Factura;
import com.wedevs.supermercado.web.app.models.Producto;

@Service
public class ProductoFacturaClienteServiceImpl implements IProductoFacturaClienteService{
	
	@Autowired
	private IProductoFacturaClienteDao productoFacturaClienteDao;
	
	@Autowired
	private IFacturaDao facturaDao;

	@Override
	public List<Factura> facturaConMasProductos(Date fecha) {
		// TODO Auto-generated method stub
		return (List<Factura>)facturaDao.facturaConMasProductos(fecha);
	}

	@Override
	public List<Producto> productosMasVendidos(@DateTimeFormat(pattern = "dd-MM-yyyy")Date fecha) {
		// TODO Auto-generated method stub
		return (List<Producto>)productoFacturaClienteDao.productosMasVendidos(fecha);
	}

	@Override
	public List<Factura> facturasConMasProductos(Date fechaA, Date fechaB, String ci) {
		// TODO Auto-generated method stub
		return (List<Factura>)productoFacturaClienteDao.facturasConMasProductos(fechaA, fechaB, ci);
	}

}
