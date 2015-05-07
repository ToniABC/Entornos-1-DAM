/**
 * 
 */
package org.cuatrovientos.whonumberis;

import java.util.Scanner;

/**
 * Simple exercise analyze a number
 * @author Toni
 *
 */
public class WhoNumberIs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		String line = "";
		int variableA = 0;
		
		//Framework
		Scanner reader = new Scanner(System.in);
		
		//Data Input
		System.out.println("VAMOS A ANALIZAR EL NUMERO");
		System.out.println();

		System.out.println("Introduce un número: ");
		line = reader.nextLine();
		variableA = Integer.parseInt(line);
		
		//Proceed
		if (variableA > 0) {
			System.out.println("number is bigger than 0");
		} else if (variableA == 0) {
			System.out.println("number is equal than 0");
		} else {
			System.out.println("number is smaller than 0");
		}
	}

}
