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

import com.adriamilan.investigadores.dto.Investigador;
import com.adriamilan.investigadores.service.InvestigadorServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImpl ivservice;
	
	@GetMapping("/investigadores")
	public List<Investigador> listInvestigadores() {
		return ivservice.listInvestigadores();
	}
	
	@GetMapping("/investigador/{id}")
	public Investigador investigadorXID(@PathVariable(name="id") Long id) {
		return ivservice.investigadorXID(id);
	}
	
	@PostMapping("/investigador")
	public Investigador saveInvestigador(@RequestBody Investigador investigador) {
		return ivservice.saveInvestigador(investigador);
	}
	
	@PutMapping("/investigador/{id}")
	public Investigador editInvestigador(@PathVariable(name="id") Long id, @RequestBody Investigador investigador) {
		Investigador ivSelected = new Investigador();
		Investigador ivUpdated = new Investigador();
		
		ivSelected = ivservice.investigadorXID(id);
		ivSelected.setNombre_apellidos(investigador.getNombre_apellidos());
		ivSelected.setDni(investigador.getDni());
		ivSelected.setFacultad(investigador.getFacultad());
		
		ivUpdated = ivservice.editInvestigador(ivSelected);
		
		return ivUpdated;
	}
	
	@DeleteMapping("/investigador/{id}")
	public String deleteInvestigador(@PathVariable(name="id") Long id) {
		return ivservice.deleteInvestigador(id);
	}
	
}
