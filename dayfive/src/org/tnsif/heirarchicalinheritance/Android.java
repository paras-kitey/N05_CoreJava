// Base Class
package org.tnsif.heirarchicalinheritance;

public class Android {

	private String brandname;
	private int modelno;
	
	// Getters and Setters
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	// Default Constructor
	public Android() {
		super();
	}
	// Parameterized
	public Android(String brandname, int modelno) {
		super();
		this.brandname = brandname;
		this.modelno = modelno;
	}
	// To String
	@Override
	public String toString() {
		return "Android [brandname=" + brandname + ", modelno=" + modelno + ", getBrandname()=" + getBrandname()
				+ ", getModelno()=" + getModelno() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

	
	
	
	
	
}
