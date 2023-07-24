// prgm for while and do while 
package org.tnsif.looping;

import java.util.Scanner;

public class WhileExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int n =20;
		while(n<=20 && n>=1 )
		{
			System.out.print(n + " " );
			n--;
					}
	*/
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	do {
		System.out.println("Value of n is"+ n);
		n++;
	}while(n<14);
	
	
	}

}


/* Do while syntax 
 * do{
 * statement
 * }while(); 
 * HW : TO print how many digit in the given no using do while
 */