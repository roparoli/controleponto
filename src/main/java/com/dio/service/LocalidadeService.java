package com.dio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.Localidade;
import com.dio.model.Usuario;
import com.dio.repository.LocalidadeRepository;

@Service
public class LocalidadeService {

	@Autowired
	LocalidadeRepository repository;
	
	Usuario usuario;
	
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
	
	public String liberacaoAcesso (Usuario usuario, Localidade localidade) {
		String mensagem;
		String nivelAcesso = localidade.getCodNivelAcesso().toString(); 
		String nivelAcessoUsu = usuario.getCodNivelAcesso().toString();
		Long nivelAcessoLocalidade = Long.parseLong(nivelAcesso);
		Long nivelAcessoUsuario = Long.parseLong(nivelAcessoUsu);
		if(nivelAcessoLocalidade > nivelAcessoUsuario) {
			mensagem = "Usuario sem acesso a loacalidade!";
		} else {
			mensagem = "Acesso Permitido!";
		}
		return mensagem;
	}
}
