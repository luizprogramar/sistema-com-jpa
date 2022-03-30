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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int codigo;
	private String nome;
	@Column(name = "TB_Capacid")
	private int capacidade;
	private String dtFundacao;
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
	public String getDtFundacao() {
		return dtFundacao;
	}
	public void setDtFundacao(String dtFundacao) {
		this.dtFundacao = dtFundacao;
	}
	
	

}
