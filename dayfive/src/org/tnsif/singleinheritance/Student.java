// This is derived class
package org.tnsif.singleinheritance;

public class Student extends Citizen{
	private String collegename;
private int rollno;

// Default constructor of child class

public Student() {
	super();  // it will call parent class default constructor
System.out.println("Child Class Default Constructor");	
}



// Parameterized Constructor
public Student(String city, int pincode, long aadharno, long contactNo,String collegename,int rollno) {
	super(city, pincode, aadharno, contactNo);
this.rollno=rollno;
this.collegename=collegename;

}



public String getCollegename() {
	return collegename;
}



public void setCollegename(String collegename) {
	this.collegename = collegename;
}



public int getRollno() {
	return rollno;
}



public void setRollno(int rollno) {
	this.rollno = rollno;
}



@Override
public String toString() {
	return "Student [collegename=" + collegename + ", rollno=" + rollno + ", toString()=" + super.toString() + "]";
}







}
