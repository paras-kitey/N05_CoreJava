// Bitwise &,|,^,>>,<<
/*
 & : both are 1 then 1
 | : any one is 1 then 1
 ^ :  both are  same input then false
   
  * Formula for left shift : a<<b = a*2^b
  * Formula for right shift : a>>b = a/2^b

  */

package org.tnsif.operators;

public class BitwiseOperator {

	public static void main(String[] args) {
int x = 15;
int y = 3;
int a=8;
int b=1;
	System.out.println(x&y);
	System.out.println(x|y);

	System.out.println(x^y);
	
	System.out.println(a<<b);

	System.out.println(a>>b);

		
		
		
	}

}
