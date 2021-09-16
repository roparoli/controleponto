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

import com.dio.model.Ocorrencia;
import com.dio.service.OcorrenciaService;

@RestController
@RequestMapping("/categoria")
public class OcorrenciaController {

	@Autowired
	OcorrenciaService service;

	@PostMapping
	public Ocorrencia createOcorrencia(@RequestBody Ocorrencia ocorrencia) {

		return service.saveOcorrencia(ocorrencia);
	}

	@GetMapping
	public List<Ocorrencia> getTodasOcorrencias() {

		return service.findAll();
	}

	@GetMapping("/{codOcorrencia}")
	public ResponseEntity<Ocorrencia> getOcorrenciaById(@PathVariable long codOcorrencia) throws Exception {
		return ResponseEntity.ok(service.getById(codOcorrencia).orElseThrow(() -> new NoSuchElementException()));
	}
	
	@PutMapping("/{codOcorrencia}")
	public Ocorrencia updateCategoria(@RequestBody Ocorrencia ocorrencia, @PathVariable long codOcorrencia) {

		return service.updateCategoria(ocorrencia, codOcorrencia);
	}
	
	
	@DeleteMapping("/{codOcorrencia}")
	public ResponseEntity<Void> deleteOcorrenciaById(@PathVariable long codOcorrencia) throws Exception {
		service.deleteById(codOcorrencia);
		return ResponseEntity.noContent().build();
	}
}
