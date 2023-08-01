package org.tnsif.superkeyword;

class Sports
{
	String sportsname="Cricket";
	void display() 
	{
		System.out.println(sportsname);
	}
}

class Cricket extends Sports
{
	int noofplayers=12;
	
	void diaplay() 
	{
/*If parent class and child class have same method and if you want to call parent
 * class method then use super keyword with method name */		
		super.display();
		System.out.println(noofplayers);
	}
}
public class SuperWithMethod 
{

	public static void main(String[] args)
{
Cricket c = new Cricket();
c.display();
}

}
