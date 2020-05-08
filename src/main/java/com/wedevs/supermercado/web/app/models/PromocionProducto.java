package com.wedevs.supermercado.web.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@Entity
public class PromocionProducto implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_promocion")
	private Promocion idPromocion;
	
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto idProducto;
	
	private int stockPromocion;
	
	private Date createAt;

	@PrePersist
	public void Prepersist() {
		createAt= new Date();
	}
	
	public Promocion getIdPromocion() {
		return idPromocion;
	}

	public void setIdPromocion(Promocion idPromocion) {
		this.idPromocion = idPromocion;
	}

	public Producto getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}

	public int getStockPromocion() {
		return stockPromocion;
	}

	public void setStockPromocion(int stockPromocion) {
		this.stockPromocion = stockPromocion;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
	

}
