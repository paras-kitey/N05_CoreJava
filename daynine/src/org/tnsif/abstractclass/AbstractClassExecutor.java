package org.tnsif.abstractclass;
// Driver Class
public class AbstractClassExecutor {

	public static void main(String[] args) {

	/*    Cannot intansiated abstract class ( i.e cannot create object)
		 Operators o = new Operators();
	*/
		Addition a = new Addition();
		a.print(10,20 );
	a.operation();
	}

}
