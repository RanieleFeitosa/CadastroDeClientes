package com.raniele.cadastrodecliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raniele.cadastrodecliente.entity.Pessoa;
import com.raniele.cadastrodecliente.service.PessoaService;

@RestController
@RequestMapping("/clientes")
public class PessoaController {

	@Autowired
	private PessoaService service;

	@GetMapping // encontrar todos
	public ResponseEntity<List<Pessoa>> findAll() {
		return ResponseEntity.ok(service.findAll());
	}

	@GetMapping("/{id}") // encontrar por id
	public ResponseEntity<Pessoa> findById(@PathVariable String id) {
		Pessoa pessoa = service.findById(id);
		return ResponseEntity.ok(pessoa);
	}

	@PostMapping // criar um cliente
	public ResponseEntity<Pessoa> criar(@RequestBody Pessoa p) {
		Pessoa pessoaSalvar = service.criar(p);
		return ResponseEntity.status(HttpStatus.CREATED).body(pessoaSalvar);
	}

	@PutMapping("/{id}") // atualizar um cliente
	public ResponseEntity<String> atualizacao(@PathVariable String id, @RequestBody Pessoa p) {
		service.atualizar(id, p);
		return ResponseEntity.ok("Informações atualizadas com sucesso!");
	}

	@DeleteMapping("/{id}") // deletar um cliente
	public ResponseEntity<Void> delecao(@PathVariable String id) {
		service.deletar(id);
		return ResponseEntity.noContent().build();
	}

}
