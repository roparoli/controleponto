package com.dio.model;

import java.time.LocalDateTime;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Movimentacao {

	
	@Id
    private Long codMovimento;
	
	@ManyToMany
	Usuario codusuario;
	LocalDateTime dataEntrada;
	LocalDateTime dataSaida;
	int periodoPermanencia;
	
	@ManyToOne
	Ocorrencia codOcorrencia;
	
	@ManyToOne
	Calendario dataEspecial;

	public Movimentacao() {
		super();
	}

	public Movimentacao(Long codMovimento, Usuario codusuario, LocalDateTime dataEntrada, LocalDateTime dataSaida,
			int periodoPermanencia, Ocorrencia codOcorrencia, Calendario dataEspecial) {
		super();
		this.codMovimento = codMovimento;
		this.codusuario = codusuario;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
		this.periodoPermanencia = periodoPermanencia;
		this.codOcorrencia = codOcorrencia;
		this.dataEspecial = dataEspecial;
	}

	public Long getCodMovimento() {
		return codMovimento;
	}

	public void setCodMovimento(Long codMovimento) {
		this.codMovimento = codMovimento;
	}

	public Usuario getCodusuario() {
		return codusuario;
	}

	public void setCodusuario(Usuario codusuario) {
		this.codusuario = codusuario;
	}

	public LocalDateTime getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(LocalDateTime dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public LocalDateTime getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(LocalDateTime dataSaida) {
		this.dataSaida = dataSaida;
	}

	public int getPeriodoPermanencia() {
		return periodoPermanencia;
	}

	public void setPeriodoPermanencia(int periodoPermanencia) {
		this.periodoPermanencia = periodoPermanencia;
	}

	public Ocorrencia getCodOcorrencia() {
		return codOcorrencia;
	}

	public void setCodOcorrencia(Ocorrencia codOcorrencia) {
		this.codOcorrencia = codOcorrencia;
	}

	public Calendario getDataEspecial() {
		return dataEspecial;
	}

	public void setDataEspecial(Calendario dataEspecial) {
		this.dataEspecial = dataEspecial;
	}
	
	
}
