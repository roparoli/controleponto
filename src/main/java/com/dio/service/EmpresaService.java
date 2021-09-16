package com.dio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.Empresa;
import com.dio.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	EmpresaRepository repository;
	
	public Empresa saveEmpresa(Empresa empresa) {
		return repository.save(empresa);
	}
	
	
	public List<Empresa> findAll() {
		return repository.findAll();
	}



	public Optional<Empresa> getLocalidadeById(long codEmpresa){
		return repository.findById(codEmpresa);
	}
	
	public Empresa updateEmpresa(Empresa empresa, long codEmpresa) {
		Empresa cat = repository.getOne(codEmpresa);
		updateEmpresa(cat, empresa);
		return repository.save(cat);
		
	}
	
	public void deleteById(long codEmpresa){
		repository.deleteById(codEmpresa);
	}
	
	private void updateEmpresa(Empresa entity, Empresa obj) {
		entity.setCodEmpresa(obj.getCodEmpresa());
		entity.setDescEmpresa(obj.getDescEmpresa());
		entity.setCnpj(obj.getCnpj());
		entity.setEnderecoEmpresa(obj.getEnderecoEmpresa());
		entity.setBairroEmpresa(obj.getBairroEmpresa());
		entity.setCidadeEmpresa(obj.getCidadeEmpresa());
		entity.setEstadoEmpresa(obj.getEstadoEmpresa());
		entity.setTelefoneEmpresa(obj.getTelefoneEmpresa());
	}
}
