package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("  Please Select Maps \n" +"1.Miramar \n" + "2.Shanok \n"+ "3.Livik \n");
		int option = sc.nextInt();
		switch(option)
		{
		case 1 : 
			System.out.println("You have chossen Miramar Map");
			break;
		case 2 : 
			System.out.println("You have chossen Shanok Map");
			break;
		case 3 : 
			System.out.println("You have choosen Livik Map");
			break;
			default :
				System.out.println("Invalid input");
		}
	}

}
