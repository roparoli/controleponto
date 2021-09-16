package com.dio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.TipoData;
import com.dio.repository.TipoDataRepository;

@Service
public class TipoDataService {

	@Autowired
	TipoDataRepository repository;
	
	public TipoData saveCategoria(TipoData tipoData) {
		return repository.save(tipoData);
	}
	
	
	public List<TipoData> findAll() {
		return repository.findAll();
	}



	public Optional<TipoData> getById(long tipoData){
		return repository.findById(tipoData);
	}
	
	public TipoData updateTipoData(TipoData tipoData, long codTipoData) {
		TipoData cat = repository.getOne(codTipoData);
		updateTipoData(cat, tipoData);
		return repository.save(cat);
		
	}
	
	public void deleteById(long codTipoData){
		repository.deleteById(codTipoData);
	}
	
	private void updateTipoData(TipoData entity, TipoData obj) {
		entity.setCodTipoData(obj.getCodTipoData());
		entity.setDescTipoData(obj.getDescTipoData());
	}
}
