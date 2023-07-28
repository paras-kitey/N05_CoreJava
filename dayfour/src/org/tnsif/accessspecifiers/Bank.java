package org.tnsif.accessspecifiers;

public class Bank {

	// Different Access Specifiers
	
	public String bankname;
	private int pinNo=4465;
	long accountno= 369945021820L;
	
	//Public method

	public void displayPublic()
	{
		System.out.println("Bank name is "+bankname);
	}
	
	// Private Method
	private void displayPrivate()
	{
		System.out.println("Pin no is "+ pinNo);
	}

   // default method
	void displayDefault()
	{
		System.out.println("Account no is "+accountno);
	}

}



