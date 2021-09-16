package com.dio.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JornadaTrabalho {

	@Id
    @GeneratedValue
	long codJornada;
	
	Float quantidadeHorasJornada;
	String descJornada;

	public JornadaTrabalho() {
		super();
	}

	public JornadaTrabalho(long codJornada, Float quantidadeHorasJornada, String descJornada,
			Calendario dataEspecial, LocalDateTime hoje) {
		super();
		this.codJornada = codJornada;
		this.quantidadeHorasJornada = quantidadeHorasJornada;
		this.descJornada = descJornada;
	}

	public long getCodJornada() {
		return codJornada;
	}

	public void setCodJornada(long codJornada) {
		this.codJornada = codJornada;
	}

	public String getDescJornada() {
		return descJornada;
	}

	public void setDescJornada(String descJornada) {
		this.descJornada = descJornada;
	}

	public Float getQuantidadeHorasJornada() {
		return quantidadeHorasJornada;
	}

	public void setQuantidadeHorasJornada(Float quantidadeHorasJornada) {
		this.quantidadeHorasJornada = quantidadeHorasJornada;
	}
}

