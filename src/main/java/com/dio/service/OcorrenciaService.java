package com.dio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.Ocorrencia;
import com.dio.repository.OcorrenciaRepository;

@Service
public class OcorrenciaService {

	@Autowired
	OcorrenciaRepository repository;

	public Ocorrencia saveOcorrencia(Ocorrencia ocorrencia) {
		return repository.save(ocorrencia);
	}

	public List<Ocorrencia> findAll() {
		return repository.findAll();
	}

	public Optional<Ocorrencia> getById(long codOcorrencia) {
		return repository.findById(codOcorrencia);
	}

	public Ocorrencia updateCategoria(Ocorrencia ocorrencia, long codOcorrencia) {
		Ocorrencia cat = repository.getOne(codOcorrencia);
		updateOcorrencia(cat, ocorrencia);
		return repository.save(cat);

	}

	public void deleteById(long codOcorrencia) {
		repository.deleteById(codOcorrencia);
	}

	private void updateOcorrencia(Ocorrencia entity, Ocorrencia obj) {
		entity.setCodOcorrencia(obj.getCodOcorrencia());
		entity.setDescFormulaOcorrencia(obj.getDescFormulaOcorrencia());
		entity.setNomeOcorrencia(obj.getNomeOcorrencia());
	}
}
