package com.adriamilan.investigadores.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="facultades")
public class Facultad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="nombre")
	private String nombre;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="facultad")
	private List<Equipo> equipos;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="facultad")
	private List<Investigador> investigadores;
	
	// Constructor por defecto
	public Facultad() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Facultad(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the equipos
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Equipo> getEquipos() {
		return equipos;
	}

	/**
	 * @param equipos the equipos to set
	 */
	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	/**
	 * @return the investigadores
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Investigador> getInvestigadores() {
		return investigadores;
	}

	/**
	 * @param investigadores the investigadores to set
	 */
	public void setInvestigadores(List<Investigador> investigadores) {
		this.investigadores = investigadores;
	}

	@Override
	public String toString() {
		return "Facultad [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
