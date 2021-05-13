package com.xatbot.orientacio.interfaces;

import java.util.List;

import com.xatbot.orientacio.model.Entitat;


public interface EntidadesInterface {
	
	public Entitat getOne(Integer id);
	public List <Entitat> getRecursoPoblacio(String localidad);
	public List <Entitat> getRecursoTipus(String tipus);
	public List <Entitat> getAll();
	public void setOne(Entitat entidad);
	public void update(Entitat entidad, Integer id);
	public void deleteOne(Integer id);
}
