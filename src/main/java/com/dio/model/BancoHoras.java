package com.dio.model;

import java.time.LocalDateTime;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

public class BancoHoras {
	
	@Id
	private long idBancoHoras;
	
	@ManyToMany
	private long idMovimentacao;
	
	@OneToOne
	private long idUsuario;

	LocalDateTime dataTrabalhada;
	Float quantidadeHoras;
	float saldoHoras;
	Float horasJornada;
	
	public BancoHoras() {
		super();
	}

	public BancoHoras(long idBancoHoras, long idMovimentacao, long idUsuario, LocalDateTime dataTrabalhada,
			Float quantidadeHoras, float saldoHoras, Float horasJornada) {
		super();
		this.idBancoHoras = idBancoHoras;
		this.idMovimentacao = idMovimentacao;
		this.idUsuario = idUsuario;
		this.dataTrabalhada = dataTrabalhada;
		this.quantidadeHoras = quantidadeHoras;
		this.saldoHoras = saldoHoras;
		this.horasJornada = horasJornada;
	}

	public long getIdBancoHoras() {
		return idBancoHoras;
	}

	public void setIdBancoHoras(long idBancoHoras) {
		this.idBancoHoras = idBancoHoras;
	}

	public long getIdMovimentacao() {
		return idMovimentacao;
	}

	public void setIdMovimentacao(long idMovimentacao) {
		this.idMovimentacao = idMovimentacao;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public LocalDateTime getDataTrabalhada() {
		return dataTrabalhada;
	}

	public void setDataTrabalhada(LocalDateTime dataTrabalhada) {
		this.dataTrabalhada = dataTrabalhada;
	}

	public Float getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Float quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public float getSaldoHoras() {
		return saldoHoras;
	}

	public void setSaldoHoras(float saldodiario) {
		this.saldoHoras = saldodiario;
	}

	public Float getHorasJornada() {
		return horasJornada;
	}

	public void setHorasJornada(Float horasJornada) {
		this.horasJornada = horasJornada;
	}
}
