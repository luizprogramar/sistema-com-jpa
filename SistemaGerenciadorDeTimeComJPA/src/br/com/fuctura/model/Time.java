package br.com.fuctura.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Time")
public class Time {

	@Id
	private int codigo;
	@Column(name = "NomeTime")
	private String nome;
	private int dtdTitulos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDtdTitulos() {
		return dtdTitulos;
	}
	public void setDtdTitulos(int dtdTitulos) {
		this.dtdTitulos = dtdTitulos;
	}
	
	
}
