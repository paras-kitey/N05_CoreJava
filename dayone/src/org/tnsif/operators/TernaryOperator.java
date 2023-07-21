// Syntax : (expression) ? "True":"False"

package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		String res =(num%2==0)? "Even" : "Odd";
		System.out.println(res);

	}

}
