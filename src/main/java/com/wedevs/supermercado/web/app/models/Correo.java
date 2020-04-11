package com.wedevs.supermercado.web.app.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Correo {
	
	@Id
	private int idCorreo;
	
	private String correo;

	public int getIdCorreo() {
		return idCorreo;
	}

	public void setIdCorreo(int idCorreo) {
		this.idCorreo = idCorreo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	

}
