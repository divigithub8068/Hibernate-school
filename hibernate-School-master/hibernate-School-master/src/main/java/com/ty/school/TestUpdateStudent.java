package com.ty.school;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.w3c.dom.ElementTraversal;

public class TestUpdateStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student student = new Student();
		student.setId(2);
		student.setName("Prashi");
		student.setPercentage("76.50");
		
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
	}
}
