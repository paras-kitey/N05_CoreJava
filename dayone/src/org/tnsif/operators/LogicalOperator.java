// Program for Relational Operators
/* && if both true then true , || any one condition must be true , */
package org.tnsif.operators;

public class LogicalOperator {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println((5==3 && 15>4));

		System.out.println((5==3 || 15>4));

		System.out.println(!(5==3 && 15>4));
	}

}
