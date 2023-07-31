// It can be used to refer instance variable of current class

package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {
	// Default Variable
	int x,y;
	
	// if you don't want to use this keyword just change the parameter name
	void setData(int x,int y)
	{
		this.x=x;
		this.y=y;
		
	}
	 void display()
	 {
		 System.out.println(x+" "+y);
	 }

	public static void main(String[] args)
	{
		ThisKeywordDemoOne t = new ThisKeywordDemoOne();
		t.setData(5, 10);
		t.display();
	
	}

	
}
