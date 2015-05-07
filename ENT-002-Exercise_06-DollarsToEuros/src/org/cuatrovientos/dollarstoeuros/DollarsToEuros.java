/**
 * 
 */
package org.cuatrovientos.dollarstoeuros;

import java.util.Scanner;

/**
 * Convert Dollars to Euros
 * @author Toni
 *
 */
public class DollarsToEuros {

	// @param args

	public static void main(String[] args) {
		
		//variables
		String line = "";
		int dollares = 0;
		
		//Framework
		Scanner reader = new Scanner(System.in);
		
		//Data Input
		System.out.println("VAMOS A CONVERTIR DOLLARES EN EUROS");
		System.out.println();

		System.out.println("Introduce los dollares: ");
		line = reader.nextLine();
		dollares = Integer.parseInt(line);
				
		System.out.println("El resultado es: " + dollares * 1.27 + " €");

	}

}
