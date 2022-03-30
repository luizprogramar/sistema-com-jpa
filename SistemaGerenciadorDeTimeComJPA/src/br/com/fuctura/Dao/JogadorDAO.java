package br.com.fuctura.Dao;

import br.com.fuctura.model.Jogador;
import br.com.fuctura.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class JogadorDAO {

	private EntityManagerFactory fabrica = JPAUtil.getEntityManagerFactory();
	
	public void salvar(Jogador jogador) {
		EntityManager em = fabrica.createEntityManager();
		EntityTransaction transacao = em.getTransaction();
		transacao.begin();
		em.persist(jogador);
		transacao.commit();
		em.clear();
	}
	
	public Jogador pesquisar(Jogador jogador) {
		EntityManager em = fabrica.createEntityManager();
		
		Jogador jogar = em.find(Jogador.class,jogador.getCodigo());
		em.close();
		return jogar;
	}
	
		
}
