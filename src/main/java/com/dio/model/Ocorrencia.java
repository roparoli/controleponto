package com.dio.model;

import javax.persistence.Id;


public class Ocorrencia {

	@Id
	Long codOcorrencia;
	
	String nomeOcorrencia;
	String descFormulaOcorrencia;
	public Ocorrencia() {
		super();
	}
	public Ocorrencia(Long codOcorrencia, String nomeOcorrencia, String descFormulaOcorrencia) {
		super();
		this.codOcorrencia = codOcorrencia;
		this.nomeOcorrencia = nomeOcorrencia;
		this.descFormulaOcorrencia = descFormulaOcorrencia;
	}
	public Long getCodOcorrencia() {
		return codOcorrencia;
	}
	public void setCodOcorrencia(Long codOcorrencia) {
		this.codOcorrencia = codOcorrencia;
	}
	public String getNomeOcorrencia() {
		return nomeOcorrencia;
	}
	public void setNomeOcorrencia(String nomeOcorrencia) {
		this.nomeOcorrencia = nomeOcorrencia;
	}
	public String getDescFormulaOcorrencia() {
		return descFormulaOcorrencia;
	}
	public void setDescFormulaOcorrencia(String descFormulaOcorrencia) {
		this.descFormulaOcorrencia = descFormulaOcorrencia;
	}
	
	
}
