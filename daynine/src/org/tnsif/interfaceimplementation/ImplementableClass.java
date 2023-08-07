package org.tnsif.interfaceimplementation;





public class ImplementableClass implements DebitCard {

	
// implementation of Abstract method which was declared in interface
	@Override
	public void printdetails() 
	{
		System.out.println("Card no is : " + cardno);
	}

	
}
