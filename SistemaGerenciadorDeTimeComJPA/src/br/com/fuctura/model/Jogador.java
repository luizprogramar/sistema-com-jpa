package br.com.fuctura.model;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "jogador")
public class Jogador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String nome;
	private int idade;
	private int camisa;
    private boolean isRemovido;
    
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCamisa() {
		return camisa;
	}
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	public boolean isRemovido() {
		return isRemovido;
	}
	public void setRemovido(boolean isRemovido) {
		this.isRemovido = isRemovido;
	}
    
    

}
