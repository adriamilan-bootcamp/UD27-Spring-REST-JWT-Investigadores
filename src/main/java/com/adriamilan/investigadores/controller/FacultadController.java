package com.adriamilan.investigadores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.investigadores.dto.Facultad;
import com.adriamilan.investigadores.service.FacultadServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultadController {

	@Autowired
	FacultadServiceImpl fcservice;
	
	@GetMapping("/facultades")
	public List<Facultad> listFacultades() {
		return fcservice.listFacultades();
	}
	
	@GetMapping("/facultad/{id}")
	public Facultad facultadXID(@PathVariable(name="id") Long id) {
		return fcservice.facultadXID(id);
	}
	
	@PostMapping("/facultad")
	public Facultad saveFacultad(@RequestBody Facultad facultad) {
		return fcservice.saveFacultad(facultad);
	}
	
	@PutMapping("/facultad/{id}")
	public Facultad editFacultad(@PathVariable(name="id") Long id, @RequestBody Facultad facultad) {
		Facultad facultadSelected = new Facultad();
		Facultad facultadUpdated = new Facultad();
		
		facultadSelected = fcservice.facultadXID(id);
		facultadSelected.setNombre(facultad.getNombre());
		
		facultadUpdated = fcservice.editFacultad(facultadSelected);
		
		return facultadUpdated;
	}
	
	@DeleteMapping("/facultad/{id}")
	public String deleteFacultad(@PathVariable(name="id") Long id) {
		return fcservice.deleteFacultad(id);
	}
	
}
