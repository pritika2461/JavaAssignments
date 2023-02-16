package com.assignments;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity (name ="Laptop_Table")
public class Laptop 
{
	@Id @Column(name="Laptop_ID")
	private int LID;
    private String Lname;
    
    @OneToOne
    private Student student;
    
    // getter setter 
	public int getLID() {
		return LID;
	}
	public void setLID(int lID) {
		LID = lID;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public Laptop(int lID, String lname) {
		super();
		LID = lID;
		Lname = lname;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
}
