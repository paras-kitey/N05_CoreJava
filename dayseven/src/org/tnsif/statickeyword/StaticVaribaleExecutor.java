/*If any variable is outside the main function then to use this variable inside

 * main method
 * either we create an object of that class or simply make the variable as static*/

package org.tnsif.statickeyword;

public class StaticVaribaleExecutor 
{
	static int a =52;

	public static void main(String[] args) {

		System.out.println(a);  // one way
		
/*           Another Way
 *  StaticVaribaleExecutor s = new StaticVaribaleExecutor();
 * sysout(s.a)
 * */	
		
}

}
