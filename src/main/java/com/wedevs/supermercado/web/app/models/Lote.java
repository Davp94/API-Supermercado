package com.wedevs.supermercado.web.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Lote implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLote;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaArribo;
	
	@Temporal(TemporalType.DATE)
	private Date fechaVencimiento;
	
	private String senasag;
	
	public int getIdLote() {
		return idLote;
	}



	public void setIdLote(int idLote) {
		this.idLote = idLote;
	}



	public Date getFechaArribo() {
		return fechaArribo;
	}



	public void setFechaArribo(Date fechaArribo) {
		this.fechaArribo = fechaArribo;
	}



	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}



	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}



	public String getSenasag() {
		return senasag;
	}



	public void setSenasag(String senasag) {
		this.senasag = senasag;
	}



	private static final long serialVersionUID = 1L;

}
