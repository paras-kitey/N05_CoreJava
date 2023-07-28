/*Ask user for their birth year encoded as two digit(like "62" )and 
 * for the current year,also encoded as two digit(like"23")
 * WAP to find the user current age in year*/
package org.tnsif.challenges;

import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter your last two digit of your birth year and currnt year");
int b=sc.nextInt();
int c = sc.nextInt();
currentage( b, c);
	}
static void currentage(int b,int c)

{
	if(b<c)
	{	System.out.println("Your Current Age is " + (c-b));
	}
	else
	{
	 int  x=(100-b)+c;
	System.out.println("Your Current age is " + x);}
}
}
