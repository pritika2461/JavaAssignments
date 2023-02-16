package com.assignments;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hybernetProject.EmployeeProject.Student;

public class AppTest 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	// create object of student class
    	Student s1=new Student();
    	s1.setId(1);
    	s1.setName("Pritika");
    	
    	// create object of laptop class
    	Laptop l = new Laptop();
    	l.setLID(101);
    	l.setLname("Lenovo");
    	
	}

}
