package com.sistematizacao.sistema.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Entregadores") 
@Table(name = "Entregadores")
public class EntregadoresModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	
	@Column (unique = true, length = 14, nullable = false)
	private String cpf;
	
	@Column
	private String nome;
	
	@Column
	private Integer capacidadeDoVeiculo;
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
		
	}
	public String getCpf() {
		return cpf;
	} 
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCapacidadeDoVeiculo() {
		return capacidadeDoVeiculo;
	}
	public void setCapacidadeDoVeiculo(Integer capacidadeDoVeiculo) {
		this.capacidadeDoVeiculo = capacidadeDoVeiculo;
	}
	
}
