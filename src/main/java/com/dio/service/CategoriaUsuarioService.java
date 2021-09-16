package com.dio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.CategoriaUsuario;
import com.dio.repository.CategoriaUsuarioRepository;

@Service
public class CategoriaUsuarioService {

	@Autowired
	CategoriaUsuarioRepository repository;
	
	public CategoriaUsuario saveCategoria(CategoriaUsuario categoriaUsuario) {
		return repository.save(categoriaUsuario);
	}
	
	
	public List<CategoriaUsuario> findAll() {
		return repository.findAll();
	}



	public Optional<CategoriaUsuario> getById(long codCategoria){
		return repository.findById(codCategoria);
	}
	
	public CategoriaUsuario updateCategoria(CategoriaUsuario categoriaUsuario, long codCategoria) {
		CategoriaUsuario cat = repository.getOne(codCategoria);
		updateCategoriaUsuario(cat, categoriaUsuario);
		return repository.save(cat);
		
	}
	
	public void deleteById(long codCategoria){
		repository.deleteById(codCategoria);
	}
	
	private void updateCategoriaUsuario(CategoriaUsuario entity, CategoriaUsuario obj) {
		entity.setCodCategoria(obj.getCodCategoria());
		entity.setDescCategoria(obj.getDescCategoria());
	}
}
