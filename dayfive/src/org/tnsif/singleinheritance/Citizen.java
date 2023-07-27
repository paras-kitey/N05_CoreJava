// This is my BAse Class
package org.tnsif.singleinheritance;

public class Citizen {

	private String city;
	private int pincode;
	private long aadharno;
	private long contactNo;

	
	//Default Constructor
	
	public Citizen() {
		super();
System.out.println("Default Constructor");	}
	
	
	
	// Parameterized Constructor
	public Citizen(String city, int pincode, long aadharno, long contactNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.aadharno = aadharno;
		this.contactNo = contactNo;
		System.out.println("Parent Parameterized Constructor");

	}
	
	// Getters and Setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAadharno() {
		return aadharno;
	}
	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}



	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", aadharno=" + aadharno + ", contactNo=" + contactNo
				+ "]";
	}
	
	
	
	
	
}
