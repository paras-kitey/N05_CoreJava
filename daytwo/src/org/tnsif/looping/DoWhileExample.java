 // HW : TO print how many digit in the given no using do while

package org.tnsif.looping;

import java.util.Scanner;

public class DoWhileExample {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
int count=0;

 do
 {
	 num/=10;
	 count++;
 }while(num!=0);
 System.out.println("It is a "+ count+" digit number");
	
		
	}

}
