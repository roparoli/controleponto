package com.dio.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.model.Localidade;
import com.dio.model.Usuario;
import com.dio.service.LocalidadeService;

@RestController
@RequestMapping("/categoria")
public class LocalidadeController {

	@Autowired
	Usuario usuario;
	
	@Autowired
	LocalidadeService service;

	@PostMapping
	public Localidade createLocalidade(@RequestBody Localidade localidade) {

		return service.saveCategoria(localidade);
	}

	@GetMapping
	public List<Localidade> getLocalidade() {

		return service.findAll();
	}

	@GetMapping("/{codLocalidade}")
	public ResponseEntity<Localidade> getLocalidadeById(@PathVariable long codLocalidade) throws Exception {
		return ResponseEntity.ok(service.getById(codLocalidade).orElseThrow(() -> new NoSuchElementException()));
	}
	
	@PutMapping("/{codLocalidade}")
	public Localidade updateCategoria(@RequestBody Localidade localidade, @PathVariable long codLocalidade) {

		return service.updateLocalidade(localidade, codLocalidade);
	}
	
	
	@DeleteMapping("/{codLocalidade}")
	public ResponseEntity<Void> deleteLocalidadeById(@PathVariable long codLocalidade) throws Exception {
		service.deleteById(codLocalidade);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{codUsuario}")
	public void verificaLiberacaoAcesso (Usuario usuario, Localidade localidade) {
		String mensagem = service.liberacaoAcesso(usuario, localidade);
		System.out.println(mensagem);
	}
}
