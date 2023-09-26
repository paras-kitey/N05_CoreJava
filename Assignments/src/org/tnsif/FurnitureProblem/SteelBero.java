package org.tnsif.FurnitureProblem;

public class SteelBero extends Bero{

	
	private int beroHeight;
	
// Getters and Setters 	
	public int getBeroHeight() {
		return beroHeight;
	}
	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}
	
// Parameterized Constructor
	
	
	
public SteelBero(String breoType, String breoColor, int beroHeight, String woodtype, int beroHeight2) {
	super(breoType, breoColor, beroHeight, woodtype);
	this.beroHeight = beroHeight2;
}
// Overriding the abstract method of parent class (Bero)
	@Override
	public void calculatePrice() 
	{
		
	
	switch(beroHeight)
	{
	
	case 2:System.out.println(price);
	break;
	case 3:System.out.println(price+3000);//5000
	break;
	case 4:System.out.println(price+4500);
	break;
	case 5:System.out.println(price+5000);//8000
	break;
	case 6:System.out.println(price+7500);
	break;
	case 7:System.out.println(price+7000);//10000
	break;
	
	default: System.out.println("Not Available in this height");

		
	}
	
	}
	

}
