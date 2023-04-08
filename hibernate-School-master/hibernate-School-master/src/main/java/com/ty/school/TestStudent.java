package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.w3c.dom.ElementTraversal;

public class TestStudent 
{
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student s = new Student();
		s.setId(3);
		s.setName("Shambu");
		s.setPercentage("91.86");
		
	
		
		entityTransaction.begin();
		
		entityManager.persist(s);
		
		entityTransaction.commit();
		
		System.out.println("-------Done-------------");
	}
}
