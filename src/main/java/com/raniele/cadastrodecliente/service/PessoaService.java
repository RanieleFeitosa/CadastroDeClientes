package com.raniele.cadastrodecliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.raniele.cadastrodecliente.entity.Pessoa;
import com.raniele.cadastrodecliente.exceptions.ClienteNaoEncontradoException;
import com.raniele.cadastrodecliente.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repository;

	public List<Pessoa> findAll() { // encontrar todos
		return repository.findAll();
	}

	public Pessoa findById(String id) { // encontrar por id
		return repository.findById(id).orElseThrow(ClienteNaoEncontradoException::new);
	}

	public Pessoa criar(Pessoa pessoa) { // criar um cliente
		return repository.save(pessoa);
	}

	public Pessoa atualizar(String id, Pessoa novaAtualizacao) { // atualizar um cliente

		Pessoa pessoa = repository.findById(id).orElseThrow(ClienteNaoEncontradoException::new);

		if (novaAtualizacao.getTelefone() != null) {
			pessoa.setTelefone(novaAtualizacao.getTelefone());
		}

		if (novaAtualizacao.getEmail() != null) {
			pessoa.setEmail(novaAtualizacao.getEmail());
		}

		if (novaAtualizacao.getEndereco() != null) {
			pessoa.setEndereco(novaAtualizacao.getEndereco());
		}

		return repository.save(pessoa);
	}

	public void deletar(String id) { // deletar um cliente
		Pessoa pessoa = repository.findById(id).orElseThrow(ClienteNaoEncontradoException::new);

		repository.deleteById(id);

	}
}
