package com.adriamilan.investigadores.service;

import java.util.List;

import com.adriamilan.investigadores.dto.Equipo;

public interface IEquipoService {

	public List<Equipo> listEquipos();
	
	public Equipo equipoXID(Long id);
	
	public Equipo saveEquipo(Equipo equipo);
	
	public Equipo editEquipo(Equipo equipo);
	
	public String deleteEquipo(Long id);
	
}
