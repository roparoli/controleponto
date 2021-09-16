package com.dio.model;

import java.time.LocalDateTime;

import javax.persistence.Id;
import javax.persistence.ManyToOne;


public class Calendario {

	@Id
    private Long codCalendario;
    @ManyToOne
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
	public Calendario() {
		super();
	}
	public Calendario(Long codCalendario, TipoData tipoData, String descricao, LocalDateTime dataEspecial) {
		super();
		this.codCalendario = codCalendario;
		this.tipoData = tipoData;
		this.descricao = descricao;
		this.dataEspecial = dataEspecial;
	}
	public Long getCodCalendario() {
		return codCalendario;
	}
	public void setCodCalendario(Long codCalendario) {
		this.codCalendario = codCalendario;
	}
	public TipoData getTipoData() {
		return tipoData;
	}
	public void setTipoData(TipoData tipoData) {
		this.tipoData = tipoData;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDateTime getDataEspecial() {
		return dataEspecial;
	}
	public void setDataEspecial(LocalDateTime dataEspecial) {
		this.dataEspecial = dataEspecial;
	}
}
