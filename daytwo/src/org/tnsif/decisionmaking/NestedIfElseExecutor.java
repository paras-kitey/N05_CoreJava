// Prgm for Nested if else
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
int weight = sc.nextInt();
if(age>=12)
{
	if(weight>=40)
	{
		System.out.println("Eligible for bunjee Jumping");
	
	if(weight>=110)
		{
			System.out.println(" But Extra ropes needed");
		}
	}


}
else 
	System.out.println("Not Eligible");
	}

}
