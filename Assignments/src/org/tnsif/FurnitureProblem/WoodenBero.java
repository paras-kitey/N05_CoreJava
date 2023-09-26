package org.tnsif.FurnitureProblem;

public class WoodenBero extends Bero
{
private String woodType;


//Getters and Setters
public String getWoodType() {
	return woodType;
}
public void setWoodType(String woodType) {
	this.woodType = woodType;
}



// Parameterized Constructor
public WoodenBero(String breoType, String breoColor, int beroHeight, String woodtype, String woodType2) {
	super(breoType, breoColor, beroHeight, woodtype);
	this.woodType = woodType2;
}

@Override
public void calculatePrice() 
{
	switch(woodType)
	{
	case "PlyWood" :System.out.println(price+13000);
	break;
	case "TeakWood" :System.out.println(price+10000);
	break;
	case "EngineeredWood" :System.out.println(price+8000);
	break;
default:System.out.println("Invalid WoodType");
	}
	
}


}
