package org.tnsif.customexception;

import java.util.Scanner;

//progrm to demonstarte on user define exception

public class CustomExceptionExecutor {

	public static void main(String[] args) throws LoginCrdentials 
	{
Scanner sc = new Scanner(System.in);
String emailID=sc.nextLine();
String password = sc.nextLine();
try {
if(emailID.equals("kiteyparas@gmail.com") && password.equals("pass@123"))
{
	System.out.println("Access Granted");
	}
	
	else
	{
		throw new LoginCrdentials("Invalid Credentials");
	}
}
catch(LoginCrdentials m)
{
	System.out.println(m);
}
}
	}
