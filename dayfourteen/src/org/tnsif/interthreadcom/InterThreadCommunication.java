package org.tnsif.interthreadcom;

public class InterThreadCommunication {

	public static void main(String[] args) {
Q obj = new Q();

Producer threadone = new Producer(obj);
Consumer threadtwo = new Consumer(obj);

try
{
	threadone.join();
	threadtwo.join();

}catch(InterruptedException e)
{
	System.out.println(e);}

System.out.println(".....End of main()......");
	}

}
