/**
 * 
 */
package org.cuatrovientos;

/**
 * Simple class to show the use of a class
 * @author Toni
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Customer custom1;
		custom1 = new Customer();
		
		custom1.setName("Toni");
		custom1.setPhone("123456789");
		custom1.sayHello();
		
		System.out.println(custom1.getName());
	}

}
