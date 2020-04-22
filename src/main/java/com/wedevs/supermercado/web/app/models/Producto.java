package com.wedevs.supermercado.web.app.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	
	@Id
	private String idProducto;
	
	private double precio;
	
	private int stock;
	
	private String descripcion;
	
	private Date createAt;
	
	private String number;
	
	@PrePersist
	public void Prepersist() {
		createAt= new Date();
	}
	
	/*
	 * Cardinalidad muchos a muchos 1ra forma
	 * @JoinTable(
			name="promocion_producto",
			joinColumns = @JoinColumn(name="id_producto"),
			inverseJoinColumns = @JoinColumn(name="id_promocion")
			)
	@ManyToMany
	private List<Promocion> promociones;
	 */
	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	

}
