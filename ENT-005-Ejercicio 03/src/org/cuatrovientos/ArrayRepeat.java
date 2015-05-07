/**
 * 
 */
package org.cuatrovientos;

import java.util.Scanner;

/**Simple array exercise
 * @author Toni
 *
 */

public class ArrayRepeat {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] userArray = new int [10];
		String line = "";
		
		for (int i = 0; i < userArray.length; i++) {
			userArray [i] = 0;
		}
		
		Scanner reader = new Scanner(System.in);
		
		for (int i = 0; i < userArray.length; i++) {
			System.out.println("Introduce un número: ");
			line = reader.nextLine();
			userArray [i] = Integer.parseInt(line);
			
			System.out.println();	
		}
		
		for (int i = 0; i < userArray.length; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (userArray [i] == userArray [j]) {
					System.out.println("El número " + userArray [j] + " está repetido");
				}
			}
			
		}
		
	}

}
