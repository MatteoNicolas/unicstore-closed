package com.infratec.unicstore.domain;

import java.util.Objects;

public class Atendente {
	private Integer id;
	private String nome_atendente;
	private Integer cpf_atendente;

	private Funcionario funcionario;

	public Atendente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Atendente(Integer id, String nome_atendente, Integer cpf_atendente, Funcionario funcionario) {
		super();
		this.id = id;
		this.nome_atendente = nome_atendente;
		this.cpf_atendente = cpf_atendente;
		this.funcionario = funcionario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome_atendente() {
		return nome_atendente;
	}

	public void setNome_atendente(String nome_atendente) {
		this.nome_atendente = nome_atendente;
	}

	public Integer getCpf_atendente() {
		return cpf_atendente;
	}

	public void setCpf_atendente(Integer cpf_atendente) {
		this.cpf_atendente = cpf_atendente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atendente other = (Atendente) obj;
		return Objects.equals(id, other.id);
	}

}