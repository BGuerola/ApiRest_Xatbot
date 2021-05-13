package com.xatbot.orientacio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xatbot.orientacio.services.EntitatService;
import com.xatbot.orientacio.model.Entitat;

@RestController
public class EntitatController {
	
	@Autowired
	EntitatService service;
	
	@GetMapping ("/entitat")
	public List<Entitat>getAll(){
		return service.getAll();
	}
	
	@GetMapping("/entitat/localidad/{localidad}")
	public List<Entitat>getRecursosLocalidad(@PathVariable(value="localidad") String localidad){
		return service.getRecursoPoblacio(localidad); 
	}
	
	@GetMapping("/entitat/tipo/{tipo}")
	public List<Entitat>getRecursosTipo(@PathVariable(value="tipo") String tipo){
		return service.getRecursoTipus(tipo);
	}
	
	@GetMapping("/entitat/id/{id}")
	public Entitat getOne(@PathVariable(value="id") Integer id) {
		return service.getOne(id);
	}
	
	@PostMapping("/entitat/pujar")
	public void create (@RequestBody Entitat entitat) {
		service.setOne(entitat);
	}
	
	@PutMapping("/entitat/{id}")
	public void update(@RequestBody Entitat entidad, @PathVariable (value="id")Integer id) {
		service.update(entidad, id);
	}
	
	@DeleteMapping("/entitat/{id}")
	public void delete(@PathVariable (value="id")Integer id) {
		service.deleteOne(id);
	}
	
	
	

}
