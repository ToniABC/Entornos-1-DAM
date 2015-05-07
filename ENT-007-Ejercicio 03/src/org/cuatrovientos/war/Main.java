/**
 * 
 */
package org.cuatrovientos.war;

/**
 * @author Toni
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Tank MainTank = new Tank(100, 200, "Tanque");
		Soldier MainSoldier = new Soldier("Oficial", 30);
		
		System.out.println(MainTank.toString());
		System.out.println(MainSoldier.toString());
	}

}
