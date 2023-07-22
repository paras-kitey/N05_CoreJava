// Program to Check Eligibility for blood donation 

package org.tnsif.operators;

import java.util.Scanner;

public class BloodDonation {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your age");

		int age = sc.nextInt();
		System.out.println("Enter your Weight");

		int weight = sc.nextInt();
		if(age>=18 && weight>=50)
		System.out.println("You are Eligible for blood donation");
		
		else
			System.out.println("Sorry you are not eligible for blood donation");

	}

}
