package org.tnsif.heirarchicalinheritance;

public class SnowCone extends Android {
	

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
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}

	
// Parameterized Constructor
	public SnowCone(String brandname, int modelno,int version) {
		super(brandname, modelno);
		this.version=version;
	}
	
	
	
	
}
