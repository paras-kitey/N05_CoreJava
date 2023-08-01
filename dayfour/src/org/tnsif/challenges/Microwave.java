
/*A microwave oven manufacturer recommends that when heating two items add 50%
to the heating time and  when heating three items double the heating time.
Heating more than three items is not recommended.
WAP to find out the recommended heating time.*/
package org.tnsif.challenges;

import java.util.Scanner;

public class Microwave 
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of items");
	int items = sc.nextInt();
	
	System.out.println("Please Enter Heating Time");
	float heatingtime=sc.nextFloat();

	recomendedtime( items, heatingtime);

}

static void recomendedtime(int items,float heatingtime)

{
	float twoitems = (50*heatingtime/100)+heatingtime;
	float threeitems = (2*heatingtime);

switch(items)
{
case 1: 
System.out.println("For one item \n" +" The recomended time is : " + heatingtime +"min");
 break;
case 2: 
System.out.println("For two items \n" +" The recomended time is : " + twoitems+"min");
 break;
case 3: 
System.out.println("For three items \n" +" The recomended time is : " + threeitems+"min");
 break;
default:
	System.out.println("Heating more than three items is not recomended");


}

}





}

