package com.raniele.cadastrodecliente.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pessoa {

	@Column(nullable = false)
	String nome;

	@Id
	String cpf;

	@Column(nullable = false)
	String telefone;

	String email;

	String endereco;

	@Column(nullable = false)
	String nomeDoMedicamento;

	@Column(nullable = false)
	Integer quatidadeVendida;

	Integer lote;

	public Pessoa() {

	}

	public Pessoa(String nome, String cpf, String telefone, String email, String endereco, String nomeDoMedicamento,
			Integer quatidadeVendida, Integer lote) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
		this.nomeDoMedicamento = nomeDoMedicamento;
		this.quatidadeVendida = quatidadeVendida;
		this.lote = lote;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNomeDoMedicamento() {
		return nomeDoMedicamento;
	}

	public void setNomeDoMedicamento(String nomeDoMedicamento) {
		this.nomeDoMedicamento = nomeDoMedicamento;
	}

	public Integer getQuatidadeVendida() {
		return quatidadeVendida;
	}

	public void setQuatidadeVendida(Integer quatidadeVendida) {
		this.quatidadeVendida = quatidadeVendida;
	}

	public Integer getLote() {
		return lote;
	}

	public void setLote(Integer lote) {
		this.lote = lote;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(cpf, other.cpf);
	}

}
