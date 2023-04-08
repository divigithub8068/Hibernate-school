package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVisitorById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		
		Visitor visitor = entityManager.find(Visitor.class, 1);
		
		if(visitor != null)
		{
			System.out.println("Id         :"+visitor.getId());
			System.out.println("Name       :"+visitor.getName());
			System.out.println("Email      :"+visitor.getEmail());
			System.out.println("Dob        :"+visitor.getDob());
			System.out.println("Gender     :"+visitor.getGender());
			System.out.println("visitiDate :"+visitor.getVisitDateTime());
		}
		else
		{
			System.out.println("No data is found");
		}
	}

}
