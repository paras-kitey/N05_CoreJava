package org.tnsif.multidimensionalarray;

import java.util.Scanner;

public class TwoDArrayExample {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
// Initializtion of arrays
		int arr[][]=new int[3][2]; // first bracket is for outer loop and second is for inner lop

// For taking input 
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
		{
			arr[i][j]=sc.nextInt();
		}

	}
	
// For Printing the arrays
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.print(arr[i][j] + " ");
		}

	}
	
	
	
	
	
	
	
	}

}
