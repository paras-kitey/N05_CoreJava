package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String args[]) {
		
		HDFC h =new HDFC();
	
		// Using setter methods to set the value
		
		h.setAcNo(365218220699L);
		h.setAccountType("Current Account");
		h.setCvvNo(287);
		h.setPinNo(5264);
		
		// using  getter methods to get the value
		// instead of using getter we can add to string method in HDFC class
	  /*System.out.println(h.getAcNo());
		System.out.println(h.getAccountType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());
      */
		
		System.out.println(h);
	}
}
