package com.dio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.Calendario;
import com.dio.repository.CalendarioRepository;

@Service
public class CalendarioService {

	@Autowired
	CalendarioRepository repository;
	
	public Calendario saveCalendario(Calendario calendario) {
		return repository.save(calendario);
	}
	
	
	public List<Calendario> findAll() {
		return repository.findAll();
	}



	public Optional<Calendario> getById(long codCalendario){
		return repository.findById(codCalendario);
	}
	
	public Calendario updateCalendario(Calendario calendario, long codCalendario) {
		Calendario cat = repository.getOne(codCalendario);
		updateCalendario(cat, calendario);
		return repository.save(cat);
		
	}
	
	public void deleteById(long codCalendario){
		repository.deleteById(codCalendario);
	}
	
	private void updateCalendario(Calendario entity, Calendario obj) {
		entity.setCodCalendario(obj.getCodCalendario());
		entity.setTipoData(obj.getTipoData());
		entity.setDataEspecial(obj.getDataEspecial());
		entity.setDescricao(obj.getDescricao());
	}
}
