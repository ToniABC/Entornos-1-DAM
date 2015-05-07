/**
 * 
 */
package org.cuatrovientos;

import java.util.Random;

/**
 * Simple Coin Class
 * @author Toni
 *
 */
public class Coin {

	private Boolean faceCoin;
	private Random rnd = new Random();
	
	/**
	 * @return the name
	 */
	public String flip() {
		faceCoin = rnd.nextBoolean();
		
		if (faceCoin == true) {
			return "Heads";
		} else {
			return "Tails";
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Coin moneda;
		moneda = new Coin();
		
		System.out.println(moneda.flip());
	}

}
