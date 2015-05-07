/**
 * 
 */
package org.cuatrovientos;

/**
 * @author Toni
 *
 */
public class Combat {

	// Parameters
	
	private int ataque;
	private int defensa;
	private int vida;
	
	// Methods
	
	public void combate (JavaMon javamonPlayer1, JavaMon javamonPlayer2) {
		
		System.out.println();
		System.out.println("Van a combatir " + javamonPlayer1.getName() + " y " + javamonPlayer2.getName());
		combatir(javamonPlayer1, javamonPlayer2);
		
		System.out.println();
		if (javamonPlayer1.getLife() <= 0) {
			System.out.println("Después de una intensa lucha el ganador ha sido " + javamonPlayer2.getName());
		} else {
			System.out.println("Después de una intensa lucha el ganador ha sido " + javamonPlayer1.getName());
		}
	}
	
	private void combatir (JavaMon javamonPlayer1, JavaMon javamonPlayer2) {
		
		do {
			asalto(javamonPlayer1, javamonPlayer2);
		} while (javamonPlayer1.getLife() >= 0 && javamonPlayer2.getLife() >= 0);
		
	}
	
	private void asalto (JavaMon javamonPlayer1, JavaMon javamonPlayer2) {
		
		System.out.println();
		
		if (javamonPlayer1.inicativa() >= javamonPlayer2.inicativa()) {
			
			System.out.println("Empieza atacando " + javamonPlayer1.getName());
			resultado(javamonPlayer1, javamonPlayer2);
			
			System.out.println("Ahora ataca " + javamonPlayer2.getName());
			resultado(javamonPlayer2, javamonPlayer1);
			
		} else {
			System.out.println("Empieza atacando " + javamonPlayer2.getName());
			resultado(javamonPlayer2, javamonPlayer1);
			
			System.out.println("Ahora ataca " + javamonPlayer1.getName());
			resultado(javamonPlayer1, javamonPlayer2);
		}
	}
	
	private void resultado (JavaMon javamonPlayer1, JavaMon javamonPlayer2) {
		
		ataque = javamonPlayer1.ataque();
		System.out.println(javamonPlayer1.getName() + " ataca con " + ataque);
		defensa = javamonPlayer2.defensa();
		System.out.println(javamonPlayer2.getName() + " defiende con " + defensa);
		vida = ataque - defensa;
		if (vida > 0) {
			System.out.println(javamonPlayer2.getName() + " ha perdido " + vida + " puntos de vida.");
			javamonPlayer2.setLife(javamonPlayer2.getLife() - vida);
		} else {
			System.out.println(javamonPlayer2.getName() + " no ha perdido puntos de vida.");
		}
		
	}
	
}
