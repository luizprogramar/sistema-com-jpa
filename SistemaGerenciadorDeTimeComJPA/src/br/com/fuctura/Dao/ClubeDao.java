package br.com.fuctura.Dao;

import br.com.fuctura.model.Clube;
import br.com.fuctura.util.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

public class ClubeDao {
	
	private EntityManagerFactory emf = JPAUtil.getEntityManagerFactory();
	
	public void salvar(Clube clube) {
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tran = em.getTransaction();
		
		tran.begin();
		em.persist(clube);
		tran.commit();
		System.out.println("inserido");
		em.close();
	}
	
	

}
