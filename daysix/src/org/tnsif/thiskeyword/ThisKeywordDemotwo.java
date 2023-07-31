// this keyword for constructor
package org.tnsif.thiskeyword;

public class ThisKeywordDemotwo {
	
int x,y;
 public ThisKeywordDemotwo(int x,int y)
{this.x=x;
this.y=y;
	}
 void display() {
	 System.out.println(x+" "+y);
 }

	public static void main(String[] args) {
		ThisKeywordDemotwo t=new ThisKeywordDemotwo(2,3);
		t.display();
	}

}
