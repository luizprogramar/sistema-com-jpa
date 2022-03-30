package br.com.fuctura;

import br.com.fuctura.Dao.JogadorDAO;
import br.com.fuctura.model.Jogador;

public class Teste {

	public static void main(String[] args) {

		Jogador dao = new Jogador();
		dao.setCodigo(0);
		dao.setNome("bebeto");
		dao.setIdade(27);
		dao.setCamisa(7);
		dao.setRemovido(false);
		
		Jogador dao2 = new Jogador();
		dao2.setCodigo(0);
		dao2.setNome("Branco");
		dao2.setIdade(20);
		dao2.setCamisa(9);
		dao2.setRemovido(false);
		
		Jogador dao3 = new Jogador();
		dao3.setCodigo(0);
		dao3.setNome("rivaldo");
		dao3.setIdade(36);
		dao3.setCamisa(10);
		dao3.setRemovido(false);
		
		Jogador jog = new Jogador();
		jog.setCodigo(0);
		jog.setNome("ronaldinho");
		jog.setIdade(22);
		jog.setCamisa(8);
		jog.setRemovido(false);
		
		
		JogadorDAO inserir= new JogadorDAO();
		
		inserir.salvar(dao);
		inserir.salvar(dao2);
		inserir.salvar(dao3);
		inserir.salvar(jog);
		

		

	
	}

}
