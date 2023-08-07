package org.tnsif.functionalinterfaceimplementation;
/*Interface which have exactly one abstract method is called as
 * functional interface
*/

@FunctionalInterface //ensures that we want exactly one method inside the interface
public interface Popcorn
{
void dispalyrecipie(); // abstract method
}


/* first way to provide the implementation to abstract method is 
   implementable class and another way is  lambda expression
*/