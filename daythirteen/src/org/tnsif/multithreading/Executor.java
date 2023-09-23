package org.tnsif.multithreading;

public class Executor {

	public static void main(String[] args) 
	{
		ChildThread t1 = new ChildThread();
		t1.run(); 
/*you can call this run method explicitally multiple times
 * but the explicit calling amke the application as singlethreaded
 * application..*/
	}

}
