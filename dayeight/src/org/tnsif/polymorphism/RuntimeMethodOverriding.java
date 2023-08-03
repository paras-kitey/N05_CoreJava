// note : Variable datatype must be same name can be different

package org.tnsif.polymorphism;
import java.util.Scanner;

class Laptop
{
	
	String gen1;
void specs(String gen1, String gen2)
{
	System.out.println("Laptop "+ gen1);
}
}
class Hp extends Laptop
{
	String gen2;
	void specs(String gen1 ,String gen2)
	{
		super.specs(gen1,gen2);
		System.out.println("Hp "+ gen2);
	}
}

public class RuntimeMethodOverriding 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String gen1 = sc.nextLine();
		String gen2 = sc.nextLine();
		
Hp h = new Hp();
h.specs(gen1,gen2);
	}

}
