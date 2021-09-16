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

import com.dio.model.TipoData;
import com.dio.service.TipoDataService;

@RestController
@RequestMapping("/categoria")
public class TipoDataController {

	@Autowired
	TipoDataService service;

	@PostMapping
	public TipoData createCategoria(@RequestBody TipoData tipoData) {

		return service.saveCategoria(tipoData);
	}

	@GetMapping
	public List<TipoData> getTodosTiposDatas() {

		return service.findAll();
	}

	@GetMapping("/{codTipoData}")
	public ResponseEntity<TipoData> getTipoDataById(@PathVariable long codTipoData) throws Exception {
		return ResponseEntity.ok(service.getById(codTipoData).orElseThrow(() -> new NoSuchElementException()));
	}
	
	@PutMapping("/{codTipoData}")
	public TipoData updateTipoData(@RequestBody TipoData tipoData, @PathVariable long codTipoData) {

		return service.updateTipoData(tipoData, codTipoData);
	}
	
	
	@DeleteMapping("/{codTipoData}")
	public ResponseEntity<Void> deleteTipoDataById(@PathVariable long codTipoData) throws Exception {
		service.deleteById(codTipoData);
		return ResponseEntity.noContent().build();
	}
}
