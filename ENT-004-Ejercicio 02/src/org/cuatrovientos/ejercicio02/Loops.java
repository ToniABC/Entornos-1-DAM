/**
 * 
 */
package org.cuatrovientos.ejercicio02;

import java.util.Scanner;

/**
 * Exercise for Loops
 * @author Toni
 *
 */
public class Loops {

	// @param args

	public static void main(String[] args) {
		
		//variables
		String line = "";
		int number;
		
		//Framework
		Scanner reader = new Scanner(System.in);
		
		//Data Input
		System.out.println("VAMOS A SALUDARTE LAS VECES QUE ME DIGAS");
		System.out.println();

		System.out.println("Introduce el número: ");
		line = reader.nextLine();
		number = Integer.parseInt(line);
		
		if ((number > 0) && (number % 2 == 0)) {
			for (int i = 0; i < number; i++) {
				System.out.print("*");
			}
		} else {
			System.out.println("No has introducido un número válido");
			return;
		}
		
		if ((number > 0) && (number % 2 == 0)) {
			while (number > 0) {
				System.out.print("*");
				number = number - 1;
			}
		} else {
			System.out.println("No has introducido un número válido");
			return;
		}

	}
	
}
