package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetTeacherById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Teacher teacher = entityManager.find(Teacher.class, 1);

		if (teacher != null) {
			System.out.println("Id     :" + teacher.getId());
			System.out.println("Name   :" + teacher.getName());
			System.out.println("Email  :" + teacher.getEmail());
			System.out.println("Gender :" + teacher.getGender());
			System.out.println("Phone  :" + teacher.getPhone());
		} else {
			System.out.println("No data is Found");
		}
	}

}
