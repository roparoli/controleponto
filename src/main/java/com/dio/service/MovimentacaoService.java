package com.dio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.Movimentacao;
import com.dio.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {

	@Autowired
	MovimentacaoRepository repository;
	
	public Movimentacao saveMovimentacao(Movimentacao movimentacao) {
		return repository.save(movimentacao);
	}
	
	
	public List<Movimentacao> findAll() {
		return repository.findAll();
	}



	public Optional<Movimentacao> getById(long codMovimento){
		return repository.findById(codMovimento);
	}
	
	public Movimentacao updateMovimentacao(Movimentacao movimentacao, long codMovimento) {
		Movimentacao cat = repository.getOne(codMovimento);
		updateMovimentacao(cat, movimentacao);
		return repository.save(cat);
		
	}
	
	public void deleteById(long codMovimento){
		repository.deleteById(codMovimento);
	}
	
	private void updateMovimentacao(Movimentacao entity, Movimentacao obj) {
		entity.setCodMovimento(obj.getCodMovimento());
		entity.setCodusuario(obj.getCodusuario());
		entity.setCodOcorrencia(obj.getCodOcorrencia());
		entity.setDataEntrada(obj.getDataEntrada());
		entity.setDataSaida(obj.getDataSaida());
		entity.setDataEspecial(obj.getDataEspecial());
		entity.setPeriodoPermanencia(obj.getPeriodoPermanencia());
	}
}
