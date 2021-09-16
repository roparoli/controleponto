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

import com.dio.model.JornadaTrabalho;
import com.dio.service.JornadaTrabalhoService;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

	@Autowired
	JornadaTrabalhoService service;

	@PostMapping
	public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {

		return service.saveJornada(jornadaTrabalho);
	}

	@GetMapping
	public List<JornadaTrabalho> getTodasJornadas() {

		return service.findAll();
	}

	@GetMapping("/{codJornada}")
	public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable long codJornada) throws Exception {
		return ResponseEntity.ok(service.getById(codJornada).orElseThrow(() -> new NoSuchElementException()));
	}
	
	@PutMapping("/{codJornada}")
	public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho, @PathVariable long codJornada) {

		return service.updateJornada(jornadaTrabalho, codJornada);
	}
	
	
	@DeleteMapping("/{codJornada}")
	public ResponseEntity<Void> deleteJornadaById(@PathVariable long codJornada) throws Exception {
		service.deleteById(codJornada);
		return ResponseEntity.noContent().build();
	}
}
