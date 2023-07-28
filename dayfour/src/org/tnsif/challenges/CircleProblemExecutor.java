package org.tnsif.challenges;

import java.util.Scanner;

/*There are n people standing in a circle waiting to be executed.
 * The counting out begins at some point in a circle and proceeds 
 * around a circle in a fixed direction. In each step a certain no of people
 * are skipped and the next person is executed.
 * The elimination proceeds around a circle 
 * (which is becoming smaller and smaller as the executed people are removed),
 * Until only the last person remains who is given freedom
 * 
 * You have given the total number of person n and a number k which indicates that k-1 person 
 * are skip and kth person is still in a circle.
 * Task is To choose the person in the intial circle that survives*/





public class CircleProblemExecutor
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n and k");
		int n = sc.nextInt();
		int k=sc.nextInt();
		System.out.println(survive(n,k));


	}
// if any function is written outside the main function then make it as static	
	static int survive(int n,int k)
	{
		if(n==1)
		   return 1;
		
		else
			return(survive(n-1,k)+k-1)%n+1;
	}

}

