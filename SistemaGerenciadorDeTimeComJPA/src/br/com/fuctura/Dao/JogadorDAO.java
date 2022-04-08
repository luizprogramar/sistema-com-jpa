package br.com.fuctura.Dao;

import java.util.List;

import br.com.fuctura.model.Jogador;
import br.com.fuctura.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class JogadorDAO {
	
	private EntityManagerFactory fa = JPAUtil.getEntityManagerFactory();
	
	public void salvar(Jogador jogadore) {
		
		EntityManager em = fa.createEntityManager();
		EntityTransaction tra = em.getTransaction();
		tra.begin();
		em.persist(jogadore);
		tra.commit();
			
			
			
		//public List<Jogador> pesquisar(Jogador jogador1){
			// EntityManager me = fabrica.createEntityManager();
			 //TypedQuery<Jogador> consulta = me.createNamedQuery("Jogador, null)
		 }
	 
//private EntityManagerFactory fabrica = JPAUtil.getEntityManagerFactory();
		//Jogador jogar = em.find(Jogador.class,jogador.getCodigo());
	//	em.close();
	//	return jogar;
	}
	
		

