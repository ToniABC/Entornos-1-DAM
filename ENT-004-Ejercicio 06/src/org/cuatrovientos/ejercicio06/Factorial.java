/**
 * 
 */
package org.cuatrovientos.ejercicio06;

import java.util.Scanner;

/**
 * @author Toni
 *
 */
public class Factorial {

	// @param args

	public static void main(String[] args) {
		
		//variables
		String line = "";
		int number;
		double factorial;
		
		//Framework
		Scanner reader = new Scanner(System.in);
		
		//Data Input
		System.out.println("VAMOS A CALCULAR EL FACTORIAL");
		System.out.println();

		System.out.println("Introduce el número: ");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		factorial = 1;
		
		if (number > 0) {
			for (int i = number; i > 1 ; i--) {
				factorial = factorial * i;
			}
			System.out.print("" + factorial);
			
		} else {
			System.out.println("No has introducido un número válido");
			return;
		}

	}
}
