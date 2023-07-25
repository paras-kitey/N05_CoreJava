// Diver class of Citizen
package org.tnsif.classandobjects;

public class CitizenExecutor {

	public static void main(String[] args) {
		
		//Object creation for default constructr
	/*	Citizen c = new Citizen();
		c.aadharno =306042659043L;
		c.type="Adult";
		c.gender="Male";
		c.city="Nashik";
		
    */
		
		Citizen c = new Citizen("Adult",306042659043L,"Female","Male");
	System.out.println(c);
	}

}
