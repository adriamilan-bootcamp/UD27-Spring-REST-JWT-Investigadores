package com.adriamilan.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.investigadores.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Long> {

}
