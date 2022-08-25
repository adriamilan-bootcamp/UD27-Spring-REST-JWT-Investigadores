package com.adriamilan.investigadores.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="investigadores")
public class Investigador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="dni")
	private String dni;
	
	@Column(name="nombre_apellidos")
	private String nombre_apellidos;
	
	@ManyToOne
	@JoinColumn(name="facultad")
	private Facultad facultad;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy="investigador")
	private List<Reserva> reservas;
	
	// Constructor por defecto
	public Investigador() {
		
	}

	/**
	 * @param id
	 * @param dni
	 * @param nombre_apellidos
	 * @param facultad
	 */
	public Investigador(Long id, String dni, String nombre_apellidos, Facultad facultad) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre_apellidos = nombre_apellidos;
		this.facultad = facultad;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre_apellidos
	 */
	public String getNombre_apellidos() {
		return nombre_apellidos;
	}

	/**
	 * @param nombre_apellidos the nombre_apellidos to set
	 */
	public void setNombre_apellidos(String nombre_apellidos) {
		this.nombre_apellidos = nombre_apellidos;
	}

	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the reservas
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReservas() {
		return reservas;
	}

	/**
	 * @param reservas the reservas to set
	 */
	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}
	
	@Override
	public String toString() {
		return "Investigador [id=" + id + ", dni=" + dni + ", nombre_apellidos=" + nombre_apellidos + ", facultad="
				+ facultad + "]";
	}
	
}
