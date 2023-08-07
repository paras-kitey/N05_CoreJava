

package org.tnsif.interfaceimplementation;

public interface DebitCard 
{
	// by default all the variables inside the interface is final
	// so we have to intialize the value for that variable
	
long cardno = 85946222012l;

// can't use concrete method inside an interface. So by default it is an abstract method
 void printdetails();


//Default method and static method id the new feature of java 8 inside an interface

default void dispaly()
{
	System.out.println("Default method");
}

// Static method is allowed

static void print()
{
System.out.println("Static Method");	
}

}
