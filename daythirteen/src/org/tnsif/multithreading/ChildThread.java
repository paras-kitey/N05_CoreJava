package org.tnsif.multithreading;

public class ChildThread extends Thread
{
public void run()
{
	System.out.println("This is the task of chid thread....");
	System.out.println(Thread.currentThread());
	ThreadDemo.printHello();
	}
}
