package org.tnsif.uncheckexception;

import java.io.IOException;

public class ThrowExecutor {
	
	
 // Throws keyword is used to declare an exception
	static void  isElligibel(int age,int weight) throws IOException

	{
		if(age>18 && weight>50)
		{
			
		}
		else
		{
// Throw keyword is used to throw an exception Explicitly			
			throw new IOException("Crieteria Not Fullfilled");
		}
		
		
		
		
	}public static void main(String[] args) throws IOException {
		isElligibel(1,50);
	}

}
