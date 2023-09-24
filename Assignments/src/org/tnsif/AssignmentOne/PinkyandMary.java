/* Mary is good in mathematics. She is always playful and has a good memory. 
 * When her friend Pinky tells n numbers, she has a habit of telling all 
 * those numbers in the reverse order of what she told.
 * Please help her friend to find if the order in which Mary says 
 * are correct or not.*/




package org.tnsif.AssignmentOne;

import java.util.Arrays;
import java.util.Scanner;

public class PinkyandMary

{
	static Scanner sc = new Scanner(System.in);
	
// Pinky Array	
  public static void pinky(int n,int arr[])
  {
	  System.out.println("Number said by Pinky : ");
	 
	  for(int i=0;i<arr.length;i++)
	  {
		 int j=sc.nextInt();
		  arr[i]=j;
	  }
  }
  
 // Mary Array 
  public static void mary(int n,int arr2[])
  {
	  System.out.println("Number said by Mary : ");

	  for(int i=0;i<arr2.length;i++)
	  {
		 int j=sc.nextInt();
		  arr2[i]=j;
	  }
	  
  }
  //Reverse Pinky Array
  public static void reverse(int arr[],int arr2[],int n)
  {
	 int start =0;
	 int end = arr.length-1;
	while(start<end)
	{
		int temp = arr[start];
		 arr[start]= arr[end];
		 arr[end]=temp;
		 start++;
		 end--;	
	}
	
	// Check If Mary array is reverse or not
	boolean ans = true;
	for(int i=0;i<n;i++)
	{
            ans = arr2[i]== arr[i];
	}
	
	if (ans==true)
		System.out.println("Yes, it is in reverse order ");
	else 
		System.out.println("No, it is not in reverse order ");
	  
  }
  
	public static void main(String args[])
	{
		
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		 int arr2[]=new int[n];

		pinky(n, arr);
		mary(n, arr2);
		reverse(arr, arr2, n);
				
	}
	
}
