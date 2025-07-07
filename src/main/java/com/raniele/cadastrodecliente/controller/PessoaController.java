package com.raniele.cadastrodecliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raniele.cadastrodecliente.entity.Pessoa;
import com.raniele.cadastrodecliente.service.PessoaService;

@RestController
@RequestMapping("/clientes")
public class PessoaController {
	
	@Autowired
	private PessoaService service;
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> findById(@PathVariable Integer id){
		Pessoa pessoa = service.findById(id);
		return ResponseEntity.ok(pessoa);
	}
	
	
	
	
	
	
	
	
	

}
