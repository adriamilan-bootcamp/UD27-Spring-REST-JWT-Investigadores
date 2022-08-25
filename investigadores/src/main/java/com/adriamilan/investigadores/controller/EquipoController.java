package com.adriamilan.investigadores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.investigadores.dto.Equipo;
import com.adriamilan.investigadores.service.EquipoServiceImpl;

@RestController
@RequestMapping("/api")
public class EquipoController {

	@Autowired
	EquipoServiceImpl equiposerv;
	
	@GetMapping("/equipos")
	public List<Equipo> listEquipos() {
		return equiposerv.listEquipos();
	}
	
	@GetMapping("/equipo/{id}")
	public Equipo equipoXID(@PathVariable(name="id") Long id) {
		return equiposerv.equipoXID(id);
	}
	
	@PostMapping("/equipo")
	public Equipo saveEquipo(@RequestBody Equipo equipo) {
		return equiposerv.saveEquipo(equipo);
	}
	
	@PutMapping("/equipo/{id}")
	public Equipo editEquipo(@PathVariable(name="id") Long id, @RequestBody Equipo equipo) {
		Equipo equipoSelected = new Equipo();
		Equipo equipoUpdated = new Equipo();
		
		equipoSelected = equiposerv.equipoXID(id);
		equipoSelected.setNombre(equipo.getNombre());
		equipoSelected.setFacultad(equipo.getFacultad());
		
		equipoUpdated = equiposerv.editEquipo(equipoSelected);
		
		return equipoUpdated;
	}
	
}
