package com.gatti.estoque.domain.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="Teste.findAll", query="SELECT t FROM Teste t")
public class Teste implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	private String nome;

	public Teste() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}