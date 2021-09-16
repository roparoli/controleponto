package com.dio.model;

import javax.persistence.Id;


public class CategoriaUsuario {

	@Id
	Long codCategoria;
	
	String descCategoria;

	public CategoriaUsuario() {
		super();
	}

	public CategoriaUsuario(Long codCategoria, String descCategoria) {
		super();
		this.codCategoria = codCategoria;
		this.descCategoria = descCategoria;
	}

	public Long getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(Long codCategoria) {
		this.codCategoria = codCategoria;
	}

	public String getDescCategoria() {
		return descCategoria;
	}

	public void setDescCategoria(String descCategoria) {
		this.descCategoria = descCategoria;
	}
	
	
	
}
