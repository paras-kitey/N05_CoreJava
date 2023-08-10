// Prgm to demonstarte on runtime array and finf=d out the largest element
package org.tnsif.singledimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements in array");
int n = sc.nextInt();
// Array Declaration
int arr[]=new int[n];

// Taking input 
System.out.println("Enter the array");

for(int k =0;k<arr.length;k++)
{
	arr[k]=sc.nextInt();
}

// Printing Arrays
System.out.print("Array is : ");

for(int p:arr)
{
	System.out.print(p+" ");		
}

// Finding Maximum Element

int max = arr[0];          // store 0 index value in max
for(int i =0;i<arr.length-1;i++)
{
if(arr[i]>max)  // comparing the values
{
	max=arr[i];          // Storing the maximum value
}
}
System.out.println(" \n Lagest number in given array is : "+max);

Arrays.sort(arr);
for(int p:arr)

	System.out.print(p+" ");

	}

}
