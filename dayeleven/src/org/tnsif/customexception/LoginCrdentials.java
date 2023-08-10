package org.tnsif.customexception;
// progrm to demonstarte on user define exception
public class LoginCrdentials extends Exception
{
	// private data member
private String str;

// Parameterzed constructor
public LoginCrdentials(String str) {
	super();
	this.str = str;
}

// To String Method
@Override
public String toString() {
	return "LoginCrdentials [str=" + str + "]";
}

// Getters and Setters
public String getStr() {
	return str;
}

public void setStr(String str) {
	this.str = str;
}


}
