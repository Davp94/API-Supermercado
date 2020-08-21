package com.wedevs.supermercado.web.app.DTOs;

import java.io.Serializable;
import java.util.Date;

public class productoMasVevndidoDTO implements Serializable{
	



	private String idProducto;
	
	private String nombre;
	
    private	int stock;
	
	private String cantidad;
	
	
	
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



	public String getCantidad() {
		return cantidad;
	}



	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}



	private static final long serialVersionUID = 1L;
}
