package com.adriamilan.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.investigadores.dto.Facultad;

public interface IFacultadDAO extends JpaRepository<Facultad, Long> {

}
