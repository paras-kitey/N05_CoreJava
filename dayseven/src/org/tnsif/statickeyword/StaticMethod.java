package org.tnsif.statickeyword;

public class StaticMethod 
{
int x=90;
static String clgname ="MET";
/*if any method is outside the main function and we have to use it in
 * main method then we just make the method as static 
*/


public  static void print()
{
	System.out.println(clgname);
//  System.out.println(x); // We cannot use any notstatic variable into static method
}
	public static void main(String[] args) 
	{
print();
	}

}
