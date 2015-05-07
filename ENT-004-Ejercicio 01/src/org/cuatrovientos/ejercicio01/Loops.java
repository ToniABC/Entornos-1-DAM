/**
 * 
 */
package org.cuatrovientos.ejercicio01;

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
		
		if (number > 0){
			while (number > 0) {
				System.out.println("HOLA");
				number = number - 1;
			}
		} else {
			System.out.println("No has introducido un número válido");
		}
		
	}

}
