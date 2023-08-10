/*Question: Given an array nums of n integers where n > 1,
 
 * return an array output such that output[i] is equal to 
 * the product of all the elements of nums except nums[i].

Input:  [1,2,3,4]
Output: [24,12,8,6]
*/
package org.tnsif.arraysproblems;

import java.util.Scanner;

public class ArrayProblemOne {

	public static void main(String[] args)
	{
Scanner sc = new Scanner(System.in);

int nums[]= {1,2,3,4};
int n = nums.length;
int left[]=new int[n];
int right[]=new int[n];

// Input
/*for(int i=0;i<nums.length;i++)
{
	nums[i]=sc.nextInt();
}*/


//Print Array
System.out.println("Input Array is : ");

for(int i=0;i<nums.length;i++)
{

	System.out.print(nums[i]+" " );
}
System.out.println();
// Left Product
//Iterate in nums array from left to right
int p=1;

for(int k=0;k<n;k++)
{
	left[k]=p;
	p  *= nums[k];

}

// Iterate from right to left in nums array thats whay used i--
int s=1;

for(int m=n-1;m>=0;m--)
{
	right[m]=s;
	s*=nums[m];

}
// Output 

int output[]=new int[n];
for(int y=0;y<n;y++)
{
output[y]=left[y]*right[y];	
}

for(int f :output)
{
	System.out.print(f + " ");}


}

}
