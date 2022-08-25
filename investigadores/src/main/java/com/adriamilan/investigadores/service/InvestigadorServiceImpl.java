package com.adriamilan.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.investigadores.dao.IInvestigadorDAO;
import com.adriamilan.investigadores.dto.Investigador;

@Service
public class InvestigadorServiceImpl implements IInvestigadorService {

	@Autowired
	IInvestigadorDAO ivdao;

	@Override
	public List<Investigador> listInvestigadores() {
		return ivdao.findAll();
	}

	@Override
	public Investigador investigadorXID(Long id) {
		return ivdao.findById(id).get();
	}

	@Override
	public Investigador saveInvestigador(Investigador investigador) {
		return ivdao.save(investigador);
	}

	@Override
	public Investigador editInvestigador(Investigador investigador) {
		return ivdao.save(investigador);
	}

	@Override
	public String deleteInvestigador(Long id) {
		ivdao.deleteById(id);
		return "Investigador eliminado";
	}
	
}
