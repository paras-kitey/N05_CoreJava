// Prgm to demonstrate on encapsulation
/*	Encapsulation : Process of wraping data and members into single unit
	Private access specifier is used
	Advantages : data hiding, encapsulate class is easy to test, better for unit testing
*/
package org.tnsif.encapsulation;

public class HDFC {

	private long acNo;
	private int cvvNo;
	private String accountType;
	
	public long getAcNo() {
		return acNo;
	}
	public void setAcNo(long acNo) {
		this.acNo = acNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	private int pinNo;

	@Override
	public String toString() {
		return "HDFC [acNo=" + acNo + ", cvvNo=" + cvvNo + ", accountType=" + accountType + ", pinNo=" + pinNo + "]";
	}
	
}
