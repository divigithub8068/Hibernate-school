package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateTeacher {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Teacher teacher = new Teacher();
		teacher.setId(4);
		teacher.setName("Divya");
		teacher.setEmail("divyamanjunath@gmail.com");
		teacher.setPhone("12345678754");
		teacher.setGender("Female");
		
		entityTransaction.begin();
		
		entityManager.merge(teacher);
		
		entityTransaction.commit();
	}
}
