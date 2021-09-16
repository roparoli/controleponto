package com.dio.model;

import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Localidade {
	
	@Id
	Long codLocalidade;

	@ManyToOne
	NivelAcesso codNivelAcesso;
	
	String descLocalidade;

	public Localidade() {
		super();
	}

	public Localidade(Long codLocalidade, NivelAcesso codNivelAcesso, String descLocalidade) {
		super();
		this.codLocalidade = codLocalidade;
		this.codNivelAcesso = codNivelAcesso;
		this.descLocalidade = descLocalidade;
	}

	public Long getCodLocalidade() {
		return codLocalidade;
	}

	public void setCodLocalidade(Long codLocalidade) {
		this.codLocalidade = codLocalidade;
	}

	public NivelAcesso getCodNivelAcesso() {
		return codNivelAcesso;
	}

	public void setCodNivelAcesso(NivelAcesso codNivelAcesso) {
		this.codNivelAcesso = codNivelAcesso;
	}

	public String getDescLocalidade() {
		return descLocalidade;
	}

	public void setDescLocalidade(String descLocalidade) {
		this.descLocalidade = descLocalidade;
	}
	
}
