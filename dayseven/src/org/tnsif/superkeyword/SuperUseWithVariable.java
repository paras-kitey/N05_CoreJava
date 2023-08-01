package org.tnsif.superkeyword;

import java.util.Scanner;

 class State
{	
	String statename="Punjab";
	String capital;
}
	
class Capital extends State
{
	String statename="Hariyana";
	String capital="Chandigarh";


	
public void display()
{
// Super keyword with variable is used to call parent class variable	

System.out.println(super.statename);
System.out.println(statename);


}
}

// Driver class

public class SuperUseWithVariable
{
	

	public static void main(String[] args)
	{
Capital c = new Capital();
c.display();
	}

}
