package org.tnsif.multithreading;



public class ThreadDemo {

	static void printHello()
	{
		for(int i=1;i<=2;i++)
		System.out.println("within printHello : "+Thread.currentThread() + "Hello");
		
			
			//System.out.println("Hello");
	}
	
	static void printOdd()
	{
		for(int i=1;i<=10;i+=2)
			System.out.println(i);
		System.out.println("printOdd "+Thread.currentThread());
	}
	public static void main(String[] args) {
		/*
		 * Thread t=Thread.currentThread(); System.out.println(t.getName());
		 * System.out.println(t); // return the tostring method of thread class
		 * printHello();
		 */
		System.out.println(Thread.currentThread());
		//printOdd();
		ChildThread t1 = new ChildThread();
		t1.start();  // directly call start method no need to call run method explicitally 

	}

}