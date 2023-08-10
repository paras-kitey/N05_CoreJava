/*When Finally Block Doesn't Executed :

1. death of the thread
2. use system.exit method
3. due to an exception arises in finaly block

*/
package org.tnsif.uncheckexception;

import java.util.Scanner;

public class FinallyBlockNotExecuted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x and y");
		
		
		int x= sc.nextInt();
		int y = sc.nextInt();
		// Contains exception code
		try 
		{
			System.out.println(x/y);
// When we use system . exit method then finally block doesn't executed			
			System.exit(0);
		}

		// Handles the exception
		catch(Exception e)
		{
			System.out.println("Cannot Divide By Zero : "+e);
			
// When we use system . exit method then finally block doesn't executed			
              System.exit(0);
		}
		finally
		{
			// when finally block contains an exception then finally block doesn't executed
			
			// Sysout(4/0);
			System.out.println("No matter what Finally Block is always executed");

		}

	}

}
