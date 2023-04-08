package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.tool.enhance.EnhancementTask;

public class TestTeacher {

	public static void main(String[] args) {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			Teacher teacher = new Teacher();
			teacher.setId(4);
			teacher.setName("Divya");
			teacher.setEmail("divyamanjunath@gmail.com");
			teacher.setPhone("9876543210");
			teacher.setGender("Female");
			
			entityTransaction.begin();
			
			entityManager.persist(teacher);
			
			entityTransaction.commit();
			System.out.println("----------Done----------------");
	}

}
