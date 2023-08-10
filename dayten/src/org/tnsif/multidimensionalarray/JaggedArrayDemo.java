package org.tnsif.multidimensionalarray;

import java.util.Scanner;

// Program to demonstrate on jagged arrays
public class JaggedArrayDemo {

	public static void main(String[] args)
	{
/*In jagged array outside array is fixed but inside array is not fixed*/		
	
// Jagged Array Declaration
		
int arr[][]=new int[2][];

arr[0]=new int[3]; // for outside index 0 storing 3 elements 
arr[1]=new int[2]; // for outside index 1 storing 2 elements

Scanner sc = new Scanner(System.in);

// Taking input 
for(int i=0;i<arr.length;i++)   // For outside array
{
	for(int j=0;j<arr[i].length;j++)  // for inside array
	{
		arr[i][j]=sc.nextInt();
	}

}

// For Printing 

for(int i=0;i<arr.length;i++)   // For outside array
{
	for(int j=0;j<arr[i].length;j++)  // for inside array
	{
		System.out.print(arr[i][j] + " ");
	}
	System.out.println(" ");

}


	}

}
