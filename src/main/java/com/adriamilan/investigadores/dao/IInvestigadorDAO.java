package com.adriamilan.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.investigadores.dto.Investigador;

public interface IInvestigadorDAO extends JpaRepository<Investigador, Long> {

}
