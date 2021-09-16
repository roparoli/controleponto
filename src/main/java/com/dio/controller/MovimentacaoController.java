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

import com.dio.model.Movimentacao;
import com.dio.service.MovimentacaoService;

@RestController
@RequestMapping("/categoria")
public class MovimentacaoController {

	@Autowired
	MovimentacaoService service;

	@PostMapping
	public Movimentacao createMovimentacao(@RequestBody Movimentacao movimentacao) {

		return service.saveMovimentacao(movimentacao);
	}

	@GetMapping
	public List<Movimentacao> getTodasMovimentacoes() {

		return service.findAll();
	}

	@GetMapping("/{codMovimento}")
	public ResponseEntity<Movimentacao> getMovimentacaoById(@PathVariable long codMovimento) throws Exception {
		return ResponseEntity.ok(service.getById(codMovimento).orElseThrow(() -> new NoSuchElementException()));
	}
	
	@PutMapping("/{codMovimento}")
	public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacao, @PathVariable long codMovimento) {

		return service.updateMovimentacao(movimentacao, codMovimento);
	}
	
	
	@DeleteMapping("/{codMovimento}")
	public ResponseEntity<Void> deleteMovimentacaoById(@PathVariable long codMovimento) throws Exception {
		service.deleteById(codMovimento);
		return ResponseEntity.noContent().build();
	}
}
