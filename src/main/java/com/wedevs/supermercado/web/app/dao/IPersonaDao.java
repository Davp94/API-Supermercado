package com.wedevs.supermercado.web.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.wedevs.supermercado.web.app.models.Persona;

public interface IPersonaDao extends CrudRepository<Persona, String>{
	
	

}
