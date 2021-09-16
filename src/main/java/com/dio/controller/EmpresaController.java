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

import com.dio.model.CategoriaUsuario;
import com.dio.service.CategoriaUsuarioService;

@RestController
@RequestMapping("/categoria")
public class EmpresaController {

	@Autowired
	CategoriaUsuarioService service;

	@PostMapping
	public CategoriaUsuario createCategoria(@RequestBody CategoriaUsuario categoriaUsuario) {

		return service.saveCategoria(categoriaUsuario);
	}

	@GetMapping
	public List<CategoriaUsuario> getTodasCategorias() {

		return service.findAll();
	}

	@GetMapping("/{codCategoria}")
	public ResponseEntity<CategoriaUsuario> getCategoriaById(@PathVariable long codCategoria) throws Exception {
		return ResponseEntity.ok(service.getById(codCategoria).orElseThrow(() -> new NoSuchElementException()));
	}
	
	@PutMapping("/{codCategoria}")
	public CategoriaUsuario updateCategoria(@RequestBody CategoriaUsuario categoriaUsuario, @PathVariable long codCategoria) {

		return service.updateCategoria(categoriaUsuario, codCategoria);
	}
	
	
	@DeleteMapping("/{codCategoria}")
	public ResponseEntity<Void> deleteCategoriaById(@PathVariable long codCategoria) throws Exception {
		service.deleteById(codCategoria);
		return ResponseEntity.noContent().build();
	}
}
