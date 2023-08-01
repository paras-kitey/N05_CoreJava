/*WAP to calculate  the hotel tariff . 
 * The room rent is 12% high during peak seasons
   (April to June and Nov to DEC)*/
package org.tnsif.challenges;

import java.util.Scanner;

public class HotelTariff 
{

	public static void main(String[] args)
	{
Scanner sc = new Scanner(System.in);
System.out.println("Hii! Welcome to Hotel Paradise \n"+"For how many days would you like to stay and in which month");
int price=2000;
int day=sc.nextInt();
int month=sc.nextInt();
budget(day ,month,price );
System.out.println("Thank you !!");

	}
	
   static void budget(int day ,int month,int price )
     {
		
		   switch(month)
	 {
	 case 1:
	 case 2:
	 case 3:
	 case 7:
	 case 8:
	 case 9:
	 case 10:
		 System.out.println("Your Hotel Budget for " +day+ " days is Rs "+ day*price );
	 break;
	
	 case 4:
	 case 5:
	 case 6:
	 case 11:
	 case 12:
		 System.out.println("As **Peak Month** is going on so our hotel prices are increased by 20% ");
		 System.out.println("Your Hotel Budget for " +day+ " days is Rs "+ day*(price+(20*price/100)) );
	 break;
	 
	 
	 
	 
	 
	 
	 }
	 
	  }
	 
	 
	
 }

