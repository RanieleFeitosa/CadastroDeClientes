package com.raniele.cadastrodecliente.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raniele.cadastrodecliente.entity.Pessoa;
import com.raniele.cadastrodecliente.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	
	public List<Pessoa> findAll () {   //encontrar todos
		return repository.findAll();
	}
	
	public Pessoa findById(String id) {  //encontrar por id
		return repository.findById(id).orElseThrow();
	}
	
	public Pessoa criar (Pessoa id) {  //criar um cliente
		return repository.save(id);
	}
	
	
	
	
	
	
	
	

}
