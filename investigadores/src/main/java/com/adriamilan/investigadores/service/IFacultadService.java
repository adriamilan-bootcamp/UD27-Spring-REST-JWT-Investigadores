package com.adriamilan.investigadores.service;

import java.util.List;

import com.adriamilan.investigadores.dto.Facultad;

public interface IFacultadService {

	public List<Facultad> listFacultades();
	
	public Facultad facultadXID(Long id);
	
	public Facultad saveFacultad(Facultad facultad);
	
	public Facultad editFacultad(Facultad facultad);
	
	public String deleteFacultad(Long id);
	
}
