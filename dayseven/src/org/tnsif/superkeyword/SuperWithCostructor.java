package org.tnsif.superkeyword;

class Nationality
{
	String nationname;

	public Nationality(String nationname) {
		
		this.nationname = nationname;
		System.out.println(nationname);
}
	
}
class Person extends Nationality
{
String Language ;
	public Person(String nationname,String language) {

// calling to parent class constructor inside child class constructor		
		super(nationname);
		this.Language=language;
		System.out.println(language);
	}
	}

public class SuperWithCostructor {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Person p = new Person("Germany","German");
	}

}
