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

import com.dio.model.NivelAcesso;
import com.dio.service.NivelAcessoService;

@RestController
@RequestMapping("/categoria")
public class NivelAcessoController {

	@Autowired
	NivelAcessoService service;

	@PostMapping
	public NivelAcesso createCategoria(@RequestBody NivelAcesso nivelAcesso) {

		return service.saveNivelAcesso(nivelAcesso);
	}

	@GetMapping
	public List<NivelAcesso> getTodosNiveisAcesso() {

		return service.findAll();
	}

	@GetMapping("/{codNivelAcesso}")
	public ResponseEntity<NivelAcesso> getNivelAcessoById(@PathVariable long codNivelAcesso) throws Exception {
		return ResponseEntity.ok(service.getById(codNivelAcesso).orElseThrow(() -> new NoSuchElementException()));
	}
	
	@PutMapping("/{codNivelAcesso}")
	public NivelAcesso updateCategoria(@RequestBody NivelAcesso nivelAcesso, @PathVariable long codNivelAcesso) {

		return service.updateNivelAcesso(nivelAcesso, codNivelAcesso);
	}
	
	
	@DeleteMapping("/{codNivelAcesso}")
	public ResponseEntity<Void> deleteNivelAcessoById(@PathVariable long codNivelAcesso) throws Exception {
		service.deleteById(codNivelAcesso);
		return ResponseEntity.noContent().build();
	}
}
