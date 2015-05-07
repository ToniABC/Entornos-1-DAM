/**
 * 
 */
package org.cuatrovientos;

import java.util.Scanner;

/**
 * @author Toni
 *
 */
public class UserArray {

	public static void main(String[] args) {

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
				userArray [i] = userArray [i] +1;
				System.out.println(userArray [i]);
				
			}
			
		}

	}