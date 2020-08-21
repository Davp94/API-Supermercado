package com.wedevs.supermercado.web.app.DTOs;

import java.io.Serializable;
import java.util.Date;

public class productosDTO implements Serializable{

	public String idProducto;
	
	public String nombre;
	
	public	int stock;
	
	public Date fechaVencimiento;
	
		
	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}





	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}





	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}





	private static final long serialVersionUID = 1L;

}
