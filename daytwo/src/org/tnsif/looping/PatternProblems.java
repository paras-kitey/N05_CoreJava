// TO print different patterns

package org.tnsif.looping;

public class PatternProblems {

	public static void main(String[] args) 
	{
   int n;
   display(n=4);
	}

	static void display(int n)
	{
		for(int i=1;i<=n;i++)
		{
		 	for(int j=1;j<n;j++)
		 	{
		 		System.out.print("*");
		 	}
		 	System.out.println();
		}
	}
}
