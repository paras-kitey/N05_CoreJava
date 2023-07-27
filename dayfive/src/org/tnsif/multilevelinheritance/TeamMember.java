// last Child class

package org.tnsif.multilevelinheritance;

public class TeamMember extends TeamLead {
	private int teamsize;
	private int duration;
	// Parameterized Constructor
	public TeamMember(String deptname, String name, int employeeid, String leadname, int employee, String projectname,int teamsize,int duration) {
		super(deptname, name, employeeid, leadname, employee, projectname);
	this.teamsize=teamsize;
	this.duration=duration;
	}
	
	
	// Getters and Setters
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	// To String Method
	@Override
	public String toString() {
		return "TeamMember [teamsize=" + teamsize + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	

}
