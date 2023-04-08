package com.ty.school;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		String sql = "select s from Student s";
		
		Query query = entityManager.createQuery(sql);
		
		List<Student> list = query.getResultList();
		
		for(Student student:list)
		{
			System.out.println("Id      :"+student.getId());
			System.out.println("Name    :"+student.getName());
			System.out.println("Percentage:"+student.getPercentage());
			System.out.println("-------------------------------------------");
		}
	}
}
