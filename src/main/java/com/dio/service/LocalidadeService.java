package com.dio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.Localidade;
import com.dio.repository.LocalidadeRepository;

@Service
public class LocalidadeService {

	@Autowired
	LocalidadeRepository repository;
	
	public Localidade saveCategoria(Localidade localidade) {
		return repository.save(localidade);
	}
	
	
	public List<Localidade> findAll() {
		return repository.findAll();
	}



	public Optional<Localidade> getById(long codLocalidade){
		return repository.findById(codLocalidade);
	}
	
	public Localidade updateLocalidade(Localidade localidade, long codLocalidade) {
		Localidade cat = repository.getOne(codLocalidade);
		updateLocalidade(cat, localidade);
		return repository.save(cat);
		
	}
	
	public void deleteById(long codLocalidade){
		repository.deleteById(codLocalidade);
	}
	
	private void updateLocalidade(Localidade entity, Localidade obj) {
		entity.setCodLocalidade(obj.getCodLocalidade());
		entity.setDescLocalidade(obj.getDescLocalidade());
		entity.setCodNivelAcesso(obj.getCodNivelAcesso());
	}
}
