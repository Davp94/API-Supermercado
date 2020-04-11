package com.wedevs.supermercado.web.app.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
	
	@Id
	private String CI;
	
	private String nombre;
	
	private String apellido1;
	
	private String apellido2;
	
	private String DireccionNroPuerta;
	
	private String DireccionCalle;
	
	private String DireccionCiudad;
	
	private String foto;
	
	private Date createAt;
	
	private int telefono;

	public String getCI() {
		return CI;
	}

	public void setCI(String cI) {
		CI = cI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDireccionNroPuerta() {
		return DireccionNroPuerta;
	}

	public void setDireccionNroPuerta(String direccionNroPuerta) {
		DireccionNroPuerta = direccionNroPuerta;
	}

	public String getDireccionCalle() {
		return DireccionCalle;
	}

	public void setDireccionCalle(String direccionCalle) {
		DireccionCalle = direccionCalle;
	}

	public String getDireccionCiudad() {
		return DireccionCiudad;
	}

	public void setDireccionCiudad(String direccionCiudad) {
		DireccionCiudad = direccionCiudad;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	

}