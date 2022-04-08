package br.com.fuctura.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_clube")
public class Clube {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int codigo;
	private String nome;
	@Column(name = "TB_Capacid")
	private int capacidade;
	private int dtFundacao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public int getDtFundacao() {
		return dtFundacao;
	}
	public void setDtFundacao(int nt) {
		this.dtFundacao = nt;
	}
	
	

}
