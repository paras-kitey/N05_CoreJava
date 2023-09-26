package org.tnsif.FurnitureProblem;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		SteelBero steelobj = new SteelBero(null, null, 0, null, 0);

		CustomerDetails h = new CustomerDetails(null, 0, null);
WoodenBero woodenobj = new WoodenBero(null, null, 0, null, null);
System.out.println("Enter Customer name ");
h.setCustomerName(sc.nextLine()); 

System.out.println("Enter Phone Number ");
h.setPhoneNumber(sc.nextLong());

System.out.println("Enter Address");
h.setAddress(sc.next());

System.out.println("Enter Breo Type ");
 steelobj.setBreoType(sc.next());


if(steelobj.getBreoType().equals("SteelBero"))
{
	System.out.println("Enter Breo Height");
	steelobj.setBeroHeight(sc.nextInt());
	System.out.println("Enter Breo Color");
	steelobj.setBreoColor(sc.next());
	System.out.println("Amount needs to be paid : ");
	steelobj.calculatePrice() ;
}
else if(steelobj.getBreoType().equals("WoodenBero"))
{
	System.out.println("Enter Breo Color");
	woodenobj.setBreoColor(sc.next());
	System.out.println("Enter Wood Type");
	woodenobj.setWoodType(sc.next());
	System.out.println("Amount needs to be paid : ");
	woodenobj.calculatePrice();
}
else
	System.out.println("Invalid Bero Type");
	
	


	}

}
