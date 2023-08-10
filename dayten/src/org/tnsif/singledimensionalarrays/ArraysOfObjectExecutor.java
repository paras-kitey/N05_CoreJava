package org.tnsif.singledimensionalarrays;

public class ArraysOfObjectExecutor {

	public static void main(String[] args) 
	{
// we want to store arrays of differnt datatypes so thats why use class name 		
Employee arr[]=new Employee[2];
/*
 One Way
Employee e1=new Employee(1,"A", 50140.3);
Employee e2=new Employee(2, "B", 200000.5);
Employee e3=new Employee(3, "C", 10000.2);
*/

// Another Way

arr[0]=new Employee(1,"A", 50140.3);
arr[1]=new Employee(2, "B", 200000.5);

	for(int i =0;i<arr.length;i++)
	{
		System.out.println(arr[i].getId()+" "+ arr[i].getName()+" " +arr[i].getSalary());
	}
	
	
	
	
	
	}

}
