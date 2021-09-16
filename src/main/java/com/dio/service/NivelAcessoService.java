package com.dio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.NivelAcesso;
import com.dio.repository.NivelAcessoRepository;

@Service
public class NivelAcessoService {

	@Autowired
	NivelAcessoRepository repository;
	
	public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso) {
		return repository.save(nivelAcesso);
	}
	
	
	public List<NivelAcesso> findAll() {
		return repository.findAll();
	}



	public Optional<NivelAcesso> getById(long codNivelAcesso){
		return repository.findById(codNivelAcesso);
	}
	
	public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso, long codNivelAcesso) {
		NivelAcesso cat = repository.getOne(codNivelAcesso);
		updateNivelAcesso(cat, nivelAcesso);
		return repository.save(cat);
		
	}
	
	public void deleteById(long codNivelAcesso){
		repository.deleteById(codNivelAcesso);
	}
	
	private void updateNivelAcesso(NivelAcesso entity, NivelAcesso obj) {
		entity.setCodNivelAcesso(obj.getCodNivelAcesso());
		entity.setDescNivelAcesso(obj.getDescNivelAcesso());
	}
}
