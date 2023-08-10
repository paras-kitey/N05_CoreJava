package org.tnsif.uncheckexception;

import java.util.Scanner;

public class ArthimeticExecptionExecutor {

	public static void main(String[] args)
	{
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of x and y");

int x= sc.nextInt();
int y = sc.nextInt();
// Contains exception code
try 
{
	System.out.println(x/y);
}

// Handles the exception
catch(Exception e)
{
	System.out.println("Cannot Divide By Zero : "+e);
	
}

	}

}
