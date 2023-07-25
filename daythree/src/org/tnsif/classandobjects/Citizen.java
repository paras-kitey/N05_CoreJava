// Prgm to demonstrate on Default and Parameterized Constructor
package org.tnsif.classandobjects;

public class Citizen {
	
	// data members
	 String type ;
     long aadharno;
	 String gender;
	 String city;
	
	// default constructor : 

	

	public Citizen() {
		System.out.println("Default Constructor");

	}

	//parameterized constructor : 
	public Citizen(String type, long aadharno, String gender, String city) {
		super();
		this.type = type;
		this.aadharno = aadharno;
		this.gender = gender;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Citizen [type=" + type + ", aadharno=" + aadharno + ", gender=" + gender + ", city=" + city + "]";
	}
	


}
