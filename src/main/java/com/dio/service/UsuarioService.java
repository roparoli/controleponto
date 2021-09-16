package com.dio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.Usuario;
import com.dio.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
	
	public Usuario saveUsuario(Usuario usuario) {
		return repository.save(usuario);
	}
	
	
	public List<Usuario> findAll() {
		return repository.findAll();
	}



	public Optional<Usuario> getById(long codUsuario){
		return repository.findById(codUsuario);
	}
	
	public Usuario updateUsuario(Usuario usuario, long codUsuario) {
		Usuario cat = repository.getOne(codUsuario);
		updateUsuario(cat, usuario);
		return repository.save(cat);
		
	}
	
	public void deleteById(long codUsuario){
		repository.deleteById(codUsuario);
	}
	
	private void updateUsuario(Usuario entity, Usuario obj) {
		entity.setCodUsuario(obj.getCodUsuario());
		entity.setNomeUsuario(obj.getNomeUsuario());
		entity.setCodCategoria(obj.getCodCategoria());
		entity.setCodEmpresa(obj.getCodEmpresa());
		entity.setCodNivelAcesso(obj.getCodNivelAcesso());
		entity.setCodJornada(obj.getCodJornada());
		entity.setInicioJornada(obj.getInicioJornada());
		entity.setFimJornada(obj.getFimJornada());
		entity.setTolerancia(obj.getTolerancia());
	}
}
