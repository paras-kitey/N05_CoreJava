// Chid Class as well as parent class for Teammember
package org.tnsif.multilevelinheritance;

public class TeamLead extends Manager {

	private String leadname;
	private int employeeid;
	private String projectname;
	
	
	
	// Parameterized Constructor
	
	public TeamLead(String deptname, String name, int employeeid,String leadname,int employee,String projectname) {
		super(deptname, name, employeeid);
	this.employeeid=employeeid;
	this.leadname=leadname;
	this.projectname=projectname;
	}

    // To string Method
	public String toString() {
		return "TeamLead [leadname=" + leadname + ", employeeid=" + employeeid + ", projectname=" + projectname
				+ ", toString()=" + super.toString() + "]";
	}


	// Getters and Setters
	public String getLeadname() {
		return leadname;
	}



	public void setLeadname(String leadname) {
		this.leadname = leadname;
	}



	public int getEmplyid() {
		return employeeid;
	}



	public void setEmplyid(int emplyid) {
		this.employeeid = emplyid;
	}



	public String getProjectname() {
		return projectname;
	}



	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	
	
	
	
}
