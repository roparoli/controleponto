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

import com.dio.model.BancoHoras;
import com.dio.service.BancoHorasService;

@RestController
@RequestMapping("/categoria")
public class BancoHorasController {

	@Autowired
	BancoHorasService service;

	@PostMapping
	public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras) {

		return service.saveCategoria(bancoHoras);
	}

	@GetMapping
	public List<BancoHoras> getTodosBancoHoras() {

		return service.findAll();
	}

	@GetMapping("/{idBancoHoras}")
	public ResponseEntity<BancoHoras> getBancoHorasById(@PathVariable long idBancoHoras) throws Exception {
		return ResponseEntity.ok(service.getById(idBancoHoras).orElseThrow(() -> new NoSuchElementException()));
	}
	
	@PutMapping("/{idBancoHoras}")
	public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras, @PathVariable long idBancoHoras) {

		return service.updateBancoHorasDados(bancoHoras, idBancoHoras);
	}
	
	@PutMapping("/{idBancoHoras}")
	public BancoHoras updateHoras(@RequestBody BancoHoras bancoHoras, @PathVariable long idBancoHoras) {

		return service.updateSaldoHoras(bancoHoras, idBancoHoras);
	}

	
	@DeleteMapping("/{idBancoHoras}")
	public ResponseEntity<Void> deleteBancoHorasById(@PathVariable long idBancoHoras) throws Exception {
		service.deleteById(idBancoHoras);
		return ResponseEntity.noContent().build();
	}
}
