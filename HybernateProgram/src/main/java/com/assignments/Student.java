package com.assignments;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity  (name ="Student_Table")
public class Student 
{
	@Id
     private int id;
     private String name;
     
 	@OneToOne @JoinColumn(name ="Student_Laptop_ID")
 	private Laptop laptop;
 	
	 public int getId()
	 {
		return id;
   	 }
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Student(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}  
