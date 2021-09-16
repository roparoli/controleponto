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

import com.dio.model.Usuario;
import com.dio.service.UsuarioService;

@RestController
@RequestMapping("/categoria")
public class UsuarioController {

	@Autowired
	UsuarioService service;

	@PostMapping
	public Usuario createUsuario(@RequestBody Usuario usuario) {

		return service.saveUsuario(usuario);
	}

	@GetMapping
	public List<Usuario> getTodosUsuarios() {

		return service.findAll();
	}

	@GetMapping("/{codUsuario}")
	public ResponseEntity<Usuario> getUsuarioById(@PathVariable long codUsuario) throws Exception {
		return ResponseEntity.ok(service.getById(codUsuario).orElseThrow(() -> new NoSuchElementException()));
	}
	
	@PutMapping("/{codUsuario}")
	public Usuario updateUsuario(@RequestBody Usuario usuario, @PathVariable long codUsuario) {

		return service.updateUsuario(usuario, codUsuario);
	}
	
	
	@DeleteMapping("/{codUsuario}")
	public ResponseEntity<Void> deleteUsuarioById(@PathVariable long codUsuario) throws Exception {
		service.deleteById(codUsuario);
		return ResponseEntity.noContent().build();
	}
}
