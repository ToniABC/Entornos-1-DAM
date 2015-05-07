/**
 * 
 */
package org.cuatrovientos.dorsalnumber;

import java.util.Scanner;

/**
 * Exercise: ask a Number of a dorsal team
 * @author Toni
 *
 */

public class DorsalNumber {

	// @param args

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//Variables
		String line = "";
		int dorsalNumber = 0;
		
		//Framework
		Scanner reader = new Scanner(System.in);
		
		//Data Input
		System.out.println("VAMOS A INDICAR LA POSICION DEL DORSAL DE UN EQUIPO");
		System.out.println();

		System.out.println("Introduce el número del dorsal: ");
		line = reader.nextLine();
		dorsalNumber = Integer.parseInt(line);
		
		if (dorsalNumber > 0 && dorsalNumber <=99) {
			
			switch (dorsalNumber) {
				case 1:
					System.out.println("La posición del dorsal es portero");
					break;
				case 3:
				case 4:
				case 5:
					System.out.println("La posición del dorsal es defensa");
					break;
				case 6:
				case 8:
				case 11:
					System.out.println("La posición del dorsal es centrocampista");
					break;
				case 9:
					System.out.println("La posición del dorsal es punta");
					break;
				default:
					System.out.println("La posición del dorsal es polivalente");
					break;
			}
			
		} else {
			System.out.println("No has introducido un número válido");
		}
	}

}
