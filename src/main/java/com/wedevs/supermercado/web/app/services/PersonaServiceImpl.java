package com.wedevs.supermercado.web.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import com.wedevs.supermercado.web.app.dao.IPersonaDao;
import com.wedevs.supermercado.web.app.models.Persona;

public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaDao personaDao;

	@Transactional
	public List<Persona> findAll() {
		// TODO Auto-generated method stub
		return (List<Persona>) personaDao.findAll();
	}

	@Transactional
	public Persona findById(String id) {
		// TODO Auto-generated method stub
		return personaDao.findById(id).orElse(null);
	}

	@Transactional
	public Persona save(Persona persona) {
		// TODO Auto-generated method stub
		return personaDao.save(persona);
	}

	@Transactional
	public void delete(String id) {
		// TODO Auto-generated method stub
		personaDao.deleteById(id);
	}


}
