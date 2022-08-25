package com.adriamilan.investigadores.service;

import java.util.List;

import com.adriamilan.investigadores.dto.Reserva;

public interface IReservaService {

	public List<Reserva> listReservas();
	
	public Reserva reservaXID(Long id);
	
	public Reserva saveReserva(Reserva reserva);
	
	public Reserva editReserva(Reserva reserva);
	
	public String deleteReserva(Long id);
	
}
