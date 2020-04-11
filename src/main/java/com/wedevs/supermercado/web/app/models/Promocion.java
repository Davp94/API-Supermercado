package com.wedevs.supermercado.web.app.models;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="promocion")
public class Promocion {
	
	@Id
	private int idPromocion;
	
	private Date fecha_inicio;
	
	private Date fecha_fin;
	
	private double descuento;
	
	private Date createAt;
	
	/*
	 * Cardinalidad muchos a muchos 1ra forma
	@ManyToMany(mappedBy="promociones")
	private List<Producto> productos;
	 */

	

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public int getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(int idPromocion) {
		this.idPromocion = idPromocion;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	

}
