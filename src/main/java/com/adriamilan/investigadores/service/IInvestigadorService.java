package com.adriamilan.investigadores.service;

import java.util.List;

import com.adriamilan.investigadores.dto.Investigador;

public interface IInvestigadorService {

	public List<Investigador> listInvestigadores();
	
	public Investigador investigadorXID(Long id);
	
	public Investigador saveInvestigador(Investigador investigador);
	
	public Investigador editInvestigador(Investigador investigador);
	
	public String deleteInvestigador(Long id);
	
}
