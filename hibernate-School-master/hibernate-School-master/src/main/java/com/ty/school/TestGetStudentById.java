package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetStudentById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Student student = entityManager.find(Student.class, 10);
		
		if(student != null)
		{
			System.out.println("Id is   :"+student.getId());
			System.out.println("Name is :"+student.getName());
			System.out.println("Persentage is :"+student.getPercentage());
		}
		else
		{
			System.out.println("No data is exist");
		}
	}

}
