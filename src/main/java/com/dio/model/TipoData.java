package com.dio.model;

import javax.persistence.Id;


public class TipoData {
	
	@Id
	Long codTipoData;
	
	String descTipoData;

	public TipoData() {
		super();
	}

	public TipoData(Long codTipoData, String descTipoData) {
		super();
		this.codTipoData = codTipoData;
		this.descTipoData = descTipoData;
	}

	public Long getCodTipoData() {
		return codTipoData;
	}

	public void setCodTipoData(Long codTipoData) {
		this.codTipoData = codTipoData;
	}

	public String getDescTipoData() {
		return descTipoData;
	}

	public void setDescTipoData(String descTipoData) {
		this.descTipoData = descTipoData;
	}
	
	
}
