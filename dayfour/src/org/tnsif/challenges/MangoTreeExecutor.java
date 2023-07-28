/*Pratik is so much intrested in gardnening hence he plants more trees in his garden
 * He plants trees in a rectangular fashion with the order of rows and coloums and
 * numbers the trees in row wise order. He planted the mango tree only in the first row 
 * first column and last coloumn. So , given the tree number and rows and coloumns your task
 * is to find out weather the given tree is mango tree or not
 * Input n=5 (rows and coloumns)
 *       t=11(tree no)
 *       */


package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n and t");
int n = sc.nextInt();
int t = sc.nextInt();
ismangotree(n, t);
	}
	
	static void ismangotree(int n,int t)
	{
		if(t%n==0 || t%n==1 || t<=1)
			System.out.println("Mango Tree");
		else
			System.out.println("Not a mango tree");
	}

}
