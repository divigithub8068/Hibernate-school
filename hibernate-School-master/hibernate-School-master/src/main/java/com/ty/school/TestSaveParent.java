package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveParent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Parent parent = new Parent();
		parent.setName("Praveen");
		parent.setEmail("prabhu@gmail.com");
		parent.setPhone("234567876532");
		
		entityTransaction.begin();
		
		entityManager.persist(parent);
		
		entityTransaction.commit();
	}
}
