package com.dio.model;

import javax.persistence.Id;


public class Empresa {

	@Id
	Long codEmpresa;
	
	String descEmpresa;
	String cnpj;
	String enderecoEmpresa;
	String bairroEmpresa;
	String cidadeEmpresa;
	String estadoEmpresa;
	String telefoneEmpresa;
	public Empresa() {
		super();
	}
	public Empresa(Long codEmpresa, String descEmpresa, String cnpj, String enderecoEmpresa, String bairroEmpresa,
			String cidadeEmpresa, String estadoEmpresa, String telefoneEmpresa) {
		super();
		this.codEmpresa = codEmpresa;
		this.descEmpresa = descEmpresa;
		this.cnpj = cnpj;
		this.enderecoEmpresa = enderecoEmpresa;
		this.bairroEmpresa = bairroEmpresa;
		this.cidadeEmpresa = cidadeEmpresa;
		this.estadoEmpresa = estadoEmpresa;
		this.telefoneEmpresa = telefoneEmpresa;
	}
	public Long getCodEmpresa() {
		return codEmpresa;
	}
	public void setCodEmpresa(Long codEmpresa) {
		this.codEmpresa = codEmpresa;
	}
	public String getDescEmpresa() {
		return descEmpresa;
	}
	public void setDescEmpresa(String descEmpresa) {
		this.descEmpresa = descEmpresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEnderecoEmpresa() {
		return enderecoEmpresa;
	}
	public void setEnderecoEmpresa(String enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}
	public String getBairroEmpresa() {
		return bairroEmpresa;
	}
	public void setBairroEmpresa(String bairroEmpresa) {
		this.bairroEmpresa = bairroEmpresa;
	}
	public String getCidadeEmpresa() {
		return cidadeEmpresa;
	}
	public void setCidadeEmpresa(String cidadeEmpresa) {
		this.cidadeEmpresa = cidadeEmpresa;
	}
	public String getEstadoEmpresa() {
		return estadoEmpresa;
	}
	public void setEstadoEmpresa(String estadoEmpresa) {
		this.estadoEmpresa = estadoEmpresa;
	}
	public String getTelefoneEmpresa() {
		return telefoneEmpresa;
	}
	public void setTelefoneEmpresa(String telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}	
}
