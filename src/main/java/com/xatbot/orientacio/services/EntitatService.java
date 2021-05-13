package com.xatbot.orientacio.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xatbot.orientacio.dao.EntitatDao;
import com.xatbot.orientacio.interfaces.EntidadesInterface;
import com.xatbot.orientacio.model.Entitat;

@Service
@Transactional

public class EntitatService implements EntidadesInterface{

	@Autowired
	EntitatDao dao;
	
	@Override
	public Entitat getOne(Integer id) {
		return dao.findById(id).get();
	}


	@Override
	public void setOne(Entitat entitat) {
		dao.save(entitat);
	}

	@Override
	public void update(Entitat entitat, Integer id) {
		dao.findById(id).ifPresent((x)->{
			dao.save(entitat);
		});		
	}

	@Override
	public void deleteOne(Integer id) {
		dao.deleteById(id);
		
	}

	@Override
	public List<Entitat> getRecursoTipus(String tipus) {
		return (List<Entitat>) dao.findByTipo(tipus);
	}

	@Override
	public List<Entitat> getAll() {
		return (List<Entitat>) dao.findAll();
	}


	@Override
	public List<Entitat> getRecursoPoblacio(String localidad) {
		return (List<Entitat>) dao.findByLocalidad(localidad);
	}

}
