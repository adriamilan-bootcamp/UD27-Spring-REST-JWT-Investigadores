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

import com.adriamilan.investigadores.dto.Equipo;
import com.adriamilan.investigadores.dto.Reserva;
import com.adriamilan.investigadores.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaservice;
	
	@GetMapping("/reservas")
	public List<Reserva> listReservas() {
		return reservaservice.listReservas();
	}
	
	@GetMapping("/reserva/{id}")
	public Reserva reservaXID(@PathVariable(name="id") Long id) {
		return reservaservice.reservaXID(id);
	}
	
	@PostMapping("/reserva")
	public Reserva saveReserva(@RequestBody Reserva reserva) {
		return reservaservice.saveReserva(reserva);
	}
	
	@PutMapping("/reserva/{id}")
	public Reserva editEquipo(@PathVariable(name="id") Long id, @RequestBody Reserva reserva) {
		Reserva reservaSelected = new Reserva();
		Reserva reservaUpdated = new Reserva();
		
		reservaSelected = reservaservice.reservaXID(id);
		reservaSelected.setComienzo(reserva.getComienzo());
		reservaSelected.setFin(reserva.getFin());
		reservaSelected.setInvestigador(reserva.getInvestigador());
		reservaSelected.setEquipo(reserva.getEquipo());
		
		reservaUpdated = reservaservice.editReserva(reservaSelected);
		
		return reservaUpdated;
	}
	
	@DeleteMapping("/reserva/{id}")
	public String deleteEquipo(@PathVariable(name="id") Long id) {
		return reservaservice.deleteReserva(id);
	}
	
}
