package org.tnsif.statickeyword;

public class Tiger extends Animal{
	void eat()
	{System.out.println("Eating : Child");
		}
	static void run() 
	{
		
		
		// We cannot use super keyword inside the static method
		//super.run();
		System.out.println("Running : Child ");

	}
}
