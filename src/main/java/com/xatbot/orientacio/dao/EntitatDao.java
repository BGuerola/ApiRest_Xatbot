package com.xatbot.orientacio.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.xatbot.orientacio.model.Entitat;

@Repository
public interface EntitatDao extends CrudRepository<Entitat, Integer>{

	List<Entitat> findByLocalidad(String localidad);
	List<Entitat> findByTipo(String tipus);
	
	

}
