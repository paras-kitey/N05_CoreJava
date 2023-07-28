
package org.tnsif.accessspecifierdemo;

import org.tnsif.accessspecifiers.Bank;

public class BankExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank();
		b.bankname="CBI";
		b.displayPublic();
		
		/* pinno and display private method are private so 
		 * we can't access them in another class or 
		 * another package ..only we can access
		 * private data members inside the same class.
		 * 
		 * b.pinNo;
		 * b.displayPrivate
		 * 
		 * */
		
		/*b.accountno
		 *b.displayDefault 
		 * These two are defaults thats why they are not accessible into another 
		 * package..they are only accessible in the same package
		 * 
		 * */
		
	}

}
