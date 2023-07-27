package org.tnsif.heirarchicalinheritance;

public class Tiramisu extends Android {

	private int version;
// getters And Setters
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
// To String
	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
//Parametrized Constructor
	

	public Tiramisu(String brandname, int modelno,int version) {
		super(brandname, modelno);
		this.version=version;
	}
	
	
	
}
