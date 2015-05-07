/**
 * 
 */
package org.cuatrovientos.dollarsyenlibras;

import java.util.Scanner;

/**
 * Coin to dollars, yen or libras
 * @author Toni
 *
 */
public class DollarsYenLibras {

	private static final float CONVERSION_DOLARES = 1.27f;
	private static final float CONVERSION_LIBRAS = 136.26f;
	private static final float CONVERSION_YENES = 0.79f;

	// @param args

	public static void main(String[] args) {
		
		//variables
		String line = "";
		float coin = 0;
		String type = "";
		
		//Framework
		Scanner reader = new Scanner(System.in);
		
		//Data Input
		System.out.println("VAMOS A CONVERTIR EUROS EN DOLLARES, YENES O LIBRAS");
		System.out.println();

		System.out.println("Introduce los euros: ");
		line = reader.nextLine();
		coin = Float.parseFloat(line);
		
		System.out.println("A que tipo de moneda lo quieres convertir <D-Dollares> <Y-Yenes> <L-Libras>: ");
		type = reader.nextLine();
		
		switch (type.toUpperCase()) {
			case "D":
				System.out.println("La cantidad en dollares es: " + coin * CONVERSION_DOLARES);
				break;
			case "Y":
				System.out.println("La cantidad en yenes es: " + coin * CONVERSION_LIBRAS);
				break;
			case "L":
				System.out.println("La cantidad en libras es: " + coin * CONVERSION_YENES);
				break;
			default:
				System.out.println("No has introducido un tipo de conversión");
				break;
		}

	}


}
