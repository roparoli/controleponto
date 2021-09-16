package com.dio.model;

import javax.persistence.Id;


public class NivelAcesso {
	
	@Id
	Long codNivelAcesso;
	
	String descNivelAcesso;

	public NivelAcesso() {
		super();
	}

	public NivelAcesso(Long codNivelAcesso, String descNivelAcesso) {
		super();
		this.codNivelAcesso = codNivelAcesso;
		this.descNivelAcesso = descNivelAcesso;
	}

	public Long getCodNivelAcesso() {
		return codNivelAcesso;
	}

	public void setCodNivelAcesso(Long codNivelAcesso) {
		this.codNivelAcesso = codNivelAcesso;
	}

	public String getDescNivelAcesso() {
		return descNivelAcesso;
	}

	public void setDescNivelAcesso(String descNivelAcesso) {
		this.descNivelAcesso = descNivelAcesso;
	}
	
	
	
}
