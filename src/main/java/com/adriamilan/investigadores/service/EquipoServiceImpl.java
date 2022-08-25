package com.adriamilan.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.investigadores.dao.IEquipoDAO;
import com.adriamilan.investigadores.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService {

	@Autowired
	IEquipoDAO equipodao;

	@Override
	public List<Equipo> listEquipos() {
		return equipodao.findAll();
	}

	@Override
	public Equipo equipoXID(Long id) {
		return equipodao.findById(id).get();
	}

	@Override
	public Equipo saveEquipo(Equipo equipo) {
		return equipodao.save(equipo);
	}

	@Override
	public Equipo editEquipo(Equipo equipo) {
		return equipodao.save(equipo);
	}

	@Override
	public String deleteEquipo(Long id) {
		equipodao.deleteById(id);
		return "Equipo eliminado";
	}
	
}
