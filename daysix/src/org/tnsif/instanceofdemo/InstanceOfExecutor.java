package org.tnsif.instanceofdemo;

// prgm to demonstarte on instance of operator

// Parent Class

class Flower
{String name="Rose";}

// Child Class
class Rose extends Flower
{
	String color ="Red";
	
}

public class InstanceOfExecutor {

	public static void main(String[] args) {
Rose s = new Rose();
System.out.println(s instanceof Flower);
	}

}
