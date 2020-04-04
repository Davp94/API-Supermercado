package com.wedevs.supermercado.web.app.models;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Promocion {
	
	@Id
	private int id_Promocion;
	
	private Date fecha_inicio;
	
	private Date fecha_fin;
	
	private double descuento;
	
	private Date createAt;

	public int getId_Promocion() {
		return id_Promocion;
	}

	public void setId_Promocion(int id_Promocion) {
		this.id_Promocion = id_Promocion;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
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
