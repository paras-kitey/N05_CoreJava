package org.tnsif.interfaceimplementation;
//Implementation of interface
//Cannot intansiated interface so we have to use


public class ImplementExecutor {

	public static void main(String[] args)
	{
ImplementableClass i = new ImplementableClass();

// use object to call the abstract and default method

i.printdetails();  // abstract method call

i.dispaly();     //default method call


// to call static method use interface name dot static method name

DebitCard.print(); // static method call

	}

}
