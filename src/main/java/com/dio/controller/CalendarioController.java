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

import com.dio.model.Calendario;
import com.dio.service.CalendarioService;

@RestController
@RequestMapping("/categoria")
public class CalendarioController {

	@Autowired
	CalendarioService service;

	@PostMapping
	public Calendario createCalendario(@RequestBody Calendario calendario) {

		return service.saveCalendario(calendario);
	}

	@GetMapping
	public List<Calendario> getTodoCalendario() {

		return service.findAll();
	}

	@GetMapping("/{codCalendario}")
	public ResponseEntity<Calendario> getCalendarioById(@PathVariable long codCalendario) throws Exception {
		return ResponseEntity.ok(service.getById(codCalendario).orElseThrow(() -> new NoSuchElementException()));
	}
	
	@PutMapping("/{codCalendario}")
	public Calendario updateCalendario(@RequestBody Calendario calendario, @PathVariable long codCalendario) {

		return service.updateCalendario(calendario, codCalendario);
	}
	
	
	@DeleteMapping("/{codCalendario}")
	public ResponseEntity<Void> deleteCalendarioById(@PathVariable long codCalendario) throws Exception {
		service.deleteById(codCalendario);
		return ResponseEntity.noContent().build();
	}
}
