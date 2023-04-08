package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.w3c.dom.ElementTraversal;

public class TestVisitor {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Visitor visitor = new Visitor();
		visitor.setId(1);
		visitor.setName("Prashi");
		visitor.setEmail("prashi@gmail.com");
		visitor.setDob(LocalDate.of(1999, 07, 26));
		visitor.setVisitDateTime(LocalDateTime.now());
		visitor.setGender("Male");
		
		entityTransaction.begin();
		
		entityManager.persist(visitor);
		
		entityTransaction.commit();
		System.out.println("------------Done----------");
	}

}
