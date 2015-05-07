/**
 * 
 */
package org.cuatrovientos.average;

import java.util.Scanner;

/**
 * 5 numbers average
 * @author Toni
 *
 */
public class Average {
	
	public static void main (String args[]) {
		
		//variables
		String line = "";
		int variable1 = 0;
		int variable2 = 0;
		int variable3 = 0;
		int variable4 = 0;
		int variable5 = 0;
		int resultado = 0;
		
		//Framework
		Scanner reader = new Scanner(System.in);
		
		//Data Input
		System.out.println("Introduce un número: ");
		line = reader.nextLine();
		
		System.out.println("Has introducido el número: " + line);
		variable1 = Integer.parseInt(line);
		
		System.out.println("Introduce un número: ");
		line = reader.nextLine();
		
		System.out.println("Has introducido el número: " + line);
		variable2 = Integer.parseInt(line);
		
		System.out.println("Introduce un número: ");
		line = reader.nextLine();
		
		System.out.println("Has introducido el número: " + line);
		variable3 = Integer.parseInt(line);
		
		System.out.println("Introduce un número: ");
		line = reader.nextLine();
		
		System.out.println("Has introducido el número: " + line);
		variable4 = Integer.parseInt(line);
		
		System.out.println("Introduce un número: ");
		line = reader.nextLine();
		
		System.out.println("Has introducido el número: " + line);
		variable5 = Integer.parseInt(line);

		resultado = (variable1 + variable2 + variable3 + variable4 + variable5)/5;
		
		System.out.println("El resultado es: " + resultado);
				
	}


}
