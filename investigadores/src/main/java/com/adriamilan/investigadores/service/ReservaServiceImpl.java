package com.adriamilan.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.investigadores.dao.IReservaDAO;
import com.adriamilan.investigadores.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService {

	@Autowired
	IReservaDAO reservadao;

	@Override
	public List<Reserva> listReservas() {
		return reservadao.findAll();
	}

	@Override
	public Reserva reservaXID(Long id) {
		return reservadao.findById(id).get();
	}

	@Override
	public Reserva saveReserva(Reserva reserva) {
		return reservadao.save(reserva);
	}

	@Override
	public Reserva editReserva(Reserva reserva) {
		return reservadao.save(reserva);
	}

	@Override
	public String deleteReserva(Long id) {
		reservadao.deleteById(id);
		return "Reserva eliminada";
	}
	
}
