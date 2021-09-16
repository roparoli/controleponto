package com.dio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.JornadaTrabalho;
import com.dio.repository.JornadaTrabalhoRepository;

@Service
public class JornadaTrabalhoService {

	@Autowired
	JornadaTrabalhoRepository repository;
	
	public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
		return repository.save(jornadaTrabalho);
	}
		
	public List<JornadaTrabalho> findAll() {
		return repository.findAll();
	}

	public Optional<JornadaTrabalho> getById(long codJornada){
		return repository.findById(codJornada);
	}
	
	public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho, long codJornada) {
		JornadaTrabalho jornada = repository.getOne(codJornada);
		updateJornadaTrabalho(jornada, jornadaTrabalho);
		return repository.save(jornada);
		
	}
	
	public void deleteById(long codJornada){
		repository.deleteById(codJornada);
	}
	
	private void updateJornadaTrabalho(JornadaTrabalho entity, JornadaTrabalho obj) {
		entity.setCodJornada(obj.getCodJornada());
		entity.setDescJornada(obj.getDescJornada());
		entity.setQuantidadeHorasJornada(obj.getQuantidadeHorasJornada());
	}
}
