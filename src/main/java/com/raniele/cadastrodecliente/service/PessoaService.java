package com.raniele.cadastrodecliente.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raniele.cadastrodecliente.entity.Pessoa;
import com.raniele.cadastrodecliente.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repository;
	
	public Pessoa findById(Integer id) {
		return repository.findById(id).orElseThrow();
	}
	
	
	

}
