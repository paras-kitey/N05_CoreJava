package org.tnsif.uncheckexception;

public class ArrayIndexOutOfBoundExceptionExecutor {

	static void print(int arr[])
	{
		try {
		System.out.println(arr[8]);}
		catch(Exception e)
		{
			System.out.println("Exception Handled: "+e);

		}
		// Weather any exception Handles or not finally block is always executed
		finally
		{
			System.out.println("No matter what Finally Block is always executed");

		}

	}
	public static void main(String[] args) {

		
		int arr[]= {10,15,5,8};
		print(arr);
	}

}
