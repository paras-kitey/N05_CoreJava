// PRgm to demonstrate on if else statement 
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
int weight = sc.nextInt();
if(age >18 && weight> 50)
	System.out.println("Eligible for blood donation");
else
	System.out.println("Not eligible");
	}

}
