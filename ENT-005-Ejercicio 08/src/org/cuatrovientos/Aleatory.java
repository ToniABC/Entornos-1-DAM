/**
 * 
 */
package org.cuatrovientos;

import java.util.Random;

/**
 * @author Toni
 *
 */
public class Aleatory {

	public static void main(String[] args) {

		int[][] gradoArray = new int [5] [10];
		
		Random rnd = new Random();
		
		for (int i = 0; i < gradoArray.length; i++) {
			for (int j = 0; j < gradoArray [i].length; j++) {
				gradoArray [i] [j] = rnd.nextInt(30);
				
				System.out.println(gradoArray [i] [j]);	
			}
		}

		for (int i = 0; i < gradoArray.length; i++) {
			for (int j = 0; j < gradoArray [i].length; j++) {
				
				if (gradoArray [i] [j] == 15) {
					System.out.println("EL NUMERO ESTA REPETIDO Y SE ENCUENTRA EN LA POSICION: (" + i + ", " + j + ")");	
				}
			}
		}
	}

}

