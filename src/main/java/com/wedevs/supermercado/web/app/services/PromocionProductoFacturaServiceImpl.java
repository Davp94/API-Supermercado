package com.wedevs.supermercado.web.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedevs.supermercado.web.app.dao.IPromocionProductoDao;
import com.wedevs.supermercado.web.app.models.Cliente;
import com.wedevs.supermercado.web.app.models.Promocion;

@Service
public class PromocionProductoFacturaServiceImpl implements IPromocionProductoFacturaService{
	
	@Autowired
	private IPromocionProductoDao promocionProductoDao;

	@Override
	public List<Cliente> clienteConMasCompras(double monto) {
		// TODO Auto-generated method stub
		return (List<Cliente>)promocionProductoDao.clienteConMasCompras(monto);
	}

	@Override
	public List<Promocion> promocionConProducto(String idProducto) {
		// TODO Auto-generated method stub
		return (List<Promocion>)promocionProductoDao.promocionConProducto(idProducto);
	}

	@Override
	public List<Promocion> promocionMasComprada() {
		// TODO Auto-generated method stub
		return (List<Promocion>)promocionProductoDao.promocionMasComprada();
	}

}
