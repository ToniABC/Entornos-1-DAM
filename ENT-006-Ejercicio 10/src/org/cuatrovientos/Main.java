/**
 * 
 */
package org.cuatrovientos;

/**
 * @author Toni
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaMon jugador1 = new JavaMon ("JUGADOR 1");
		JavaMon jugador2 = new JavaMon ("JUGADOR 2");
		
		System.out.println();
		System.out.println(jugador1.getName());
		System.out.println("Strength: " + jugador1.getStrength());
		System.out.println("Inteligence: " + jugador1.getInteligence());
		System.out.println("Agility: " + jugador1.getAgility());
		
		System.out.println();
		System.out.println(jugador2.getName());
		System.out.println("Strength: " + jugador2.getStrength());
		System.out.println("Inteligence: " + jugador2.getInteligence());
		System.out.println("Agility: " + jugador2.getAgility());
		
		Combat combat = new Combat ();
		combat.combate(jugador1, jugador2);
		
	}

}
