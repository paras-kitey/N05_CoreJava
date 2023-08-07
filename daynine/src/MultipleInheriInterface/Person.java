package MultipleInheriInterface;

// Child Class
/*      Ambiguity doesn't arise because child class only have one method from
                            both parent class
*/

public class Person implements ColdDrink , Alcohol {

	@Override
	public void showname() {
System.out.println(brand 
		+ " " + alcoholname + " " + name);		
	}

}
