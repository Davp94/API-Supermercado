package com.wedevs.supermercado.web.app.DTOs;

import java.io.Serializable;

public class facturaMasProductosDTO implements Serializable{

	private String idFactura;
	
	private int total;
	
	private String idCliente;
	
	
	
	
	
	public String getIdFactura() {
		return idFactura;
	}





	public void setIdFactura(String idFactura) {
		this.idFactura = idFactura;
	}





	public int getTotal() {
		return total;
	}





	public void setTotal(int total) {
		this.total = total;
	}





	public String getIdCliente() {
		return idCliente;
	}





	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}





	private static final long serialVersionUID = 1L;

}
