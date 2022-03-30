package br.com.fuctura.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
	
	private static EntityManagerFactory fabrica = null;
	
	static {
		fabrica = Persistence.createEntityManagerFactory("Fuctura-PU");
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(fabrica == null) {
			fabrica = Persistence.createEntityManagerFactory("Fuctura_PU");
			
		}
		return fabrica;
	}

}
