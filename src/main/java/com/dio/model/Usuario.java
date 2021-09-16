package com.dio.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Usuario {

	@Id
	Long codUsuario;
	
	@ManyToOne
	CategoriaUsuario codCategoria;
	
	String nomeUsuario;
	
	@ManyToOne
	Empresa codEmpresa;
	
	@ManyToOne
	NivelAcesso codNivelAcesso;
	
	@ManyToOne
	JornadaTrabalho codJornada;
	
	BigDecimal tolerancia;
	LocalDateTime inicioJornada;
	LocalDateTime fimJornada;
	BigDecimal horasTrabalhadas;
	
	public Usuario() {
		super();
	}
	
	public Usuario(Long codUsuario, CategoriaUsuario codCategoria, String nomeUsuario, Empresa codEmpresa,
			NivelAcesso codNivelAcesso, JornadaTrabalho codJornada, BigDecimal tolerancia, LocalDateTime inicioJornada,
			LocalDateTime fimJornada, BigDecimal horasTrabalhadas) {
		super();
		this.codUsuario = codUsuario;
		this.codCategoria = codCategoria;
		this.nomeUsuario = nomeUsuario;
		this.codEmpresa = codEmpresa;
		this.codNivelAcesso = codNivelAcesso;
		this.codJornada = codJornada;
		this.tolerancia = tolerancia;
		this.inicioJornada = inicioJornada;
		this.fimJornada = fimJornada;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public Long getCodUsuario() {
		return codUsuario;
	}
	public void setCodUsuario(Long codUsuario) {
		this.codUsuario = codUsuario;
	}
	public CategoriaUsuario getCodCategoria() {
		return codCategoria;
	}
	public void setCodCategoria(CategoriaUsuario codCategoria) {
		this.codCategoria = codCategoria;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public Empresa getCodEmpresa() {
		return codEmpresa;
	}
	public void setCodEmpresa(Empresa codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public NivelAcesso getCodNivelAcesso() {
		return codNivelAcesso;
	}
	public void setCodNivelAcesso(NivelAcesso codNivelAcesso) {
		this.codNivelAcesso = codNivelAcesso;
	}
	public JornadaTrabalho getCodJornada() {
		return codJornada;
	}
	public void setCodJornada(JornadaTrabalho codJornada) {
		this.codJornada = codJornada;
	}
	public BigDecimal getTolerancia() {
		return tolerancia;
	}
	public void setTolerancia(BigDecimal tolerancia) {
		this.tolerancia = tolerancia;
	}
	public LocalDateTime getInicioJornada() {
		return inicioJornada;
	}
	public void setInicioJornada(LocalDateTime inicioJornada) {
		this.inicioJornada = inicioJornada;
	}
	public LocalDateTime getFimJornada() {
		return fimJornada;
	}
	public void setFimJornada(LocalDateTime fimJornada) {
		this.fimJornada = fimJornada;
	}

	public BigDecimal getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(BigDecimal horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	
}
