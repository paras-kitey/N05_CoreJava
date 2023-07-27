// Parent class 1
package org.tnsif.multilevelinheritance;

public class Manager {

	private String Deptname;
	private String name;
	private int employeeid;
	
	// Getters And Setters
	public String getDeptname() {
		return Deptname;
	}
	public void setDeptname(String deptname) {
		Deptname = deptname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	
	// Default Constructor 
	public Manager() {
		super();

	System.out.println("Default cons for Manager");}
	
	
	// Parameterized Constructor
	public Manager(String deptname, String name, int employeeid) {
		super();
		Deptname = deptname;
		this.name = name;
		this.employeeid = employeeid;
	System.out.println("Parameterized for Manager");
	}
	
	// TO String Method
	@Override
	public String toString() {
		return "Manager [Deptname=" + Deptname + ", name=" + name + ", employeeid=" + employeeid + "]";
	}
	
	
	
}
