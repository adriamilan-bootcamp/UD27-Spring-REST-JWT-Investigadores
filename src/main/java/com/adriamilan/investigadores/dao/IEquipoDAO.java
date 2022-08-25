package com.adriamilan.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.investigadores.dto.Equipo;

public interface IEquipoDAO extends JpaRepository<Equipo, Long> {

}
