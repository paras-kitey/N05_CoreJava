package org.tnsif.FurnitureProblem;

public abstract class Bero
{
protected String breoType;
protected String breoColor;
protected double price=2000;

// Abstract Method
public abstract void calculatePrice();



// Getters and Setters
public String getBreoType() {
	return breoType;
}

public void setBreoType(String breoType) {
	this.breoType = breoType;
}

public String getBreoColor() {
	return breoColor;
}

public void setBreoColor(String breoColor) {
	this.breoColor = breoColor;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}


// Parameterized Constructor

public Bero(String breoType, String breoColor, int beroHeight,String woodtype) {
	super();
	this.breoType = breoType;
	this.breoColor = breoColor;
	
}






}
