package com.adriamilan.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.investigadores.dao.IFacultadDAO;
import com.adriamilan.investigadores.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService {

	@Autowired
	IFacultadDAO fcdao;

	@Override
	public List<Facultad> listFacultades() {
		return fcdao.findAll();
	}

	@Override
	public Facultad facultadXID(Long id) {
		return fcdao.findById(id).get();
	}

	@Override
	public Facultad saveFacultad(Facultad facultad) {
		return fcdao.save(facultad);
	}

	@Override
	public Facultad editFacultad(Facultad facultad) {
		return fcdao.save(facultad);
	}

	@Override
	public String deleteFacultad(Long id) {
		fcdao.deleteById(id);
		return "Facultad Eliminada";
	}
	
}
