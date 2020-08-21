package com.wedevs.supermercado.web.app.DTOs;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class facturaDTO implements Serializable{

	private String idFactura;
	
	private int cantidad;
	
	private String ciCliente;
	
	
	public String getIdFactura() {
		return idFactura;
	}




	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}




	public int getCantidad() {
		return cantidad;
	}




	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}




	public String getCiCliente() {
		return ciCliente;
	}




	public void setCiCliente(String ciCliente) {
		this.ciCliente = ciCliente;
	}




	private static final long serialVersionUID = 1L;
	
	

}
