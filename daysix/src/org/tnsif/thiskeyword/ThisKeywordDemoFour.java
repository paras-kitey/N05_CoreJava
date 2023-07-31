package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
int x;

// Default Constructor
ThisKeywordDemoFour(){
	this(90);  // we are calling the parameterized constructor
	System.out.println("This is default constructor");
}

//Parameterized Constructor

ThisKeywordDemoFour( int x){
	this.x=x;
	System.out.println("This is Parameterized : " +x);
}

	public static void main(String[] args) {
		ThisKeywordDemoFour f=new ThisKeywordDemoFour();
		
	
	}
}
