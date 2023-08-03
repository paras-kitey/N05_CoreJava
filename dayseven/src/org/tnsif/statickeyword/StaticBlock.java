package org.tnsif.statickeyword;

public class StaticBlock {
static float salary;
String companyname;

// Static Block 
static
{
/*static block is used to initialize static varibale only we cannot use nonstatic variabel*/
//	companyname="Netflix"; 
	
	salary=900000f;	
}

// Static Method
static void print()
{
	System.out.println(salary);
	
}
	public static void main(String[] args) {
print();
	}

}


// Difference between static and new keyword