package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.w3c.dom.ElementTraversal;

public class TestDeleteStudnet {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student student = entityManager.find(Student.class, 1);
		
		if(student != null)
		{
			entityTransaction.begin();
			
			entityManager.remove(student);
			
			entityTransaction.commit();
			System.out.println("Delete Successfully..");
		}
		else
		{
			System.out.println("No data to Delete");
		}
	}

}
