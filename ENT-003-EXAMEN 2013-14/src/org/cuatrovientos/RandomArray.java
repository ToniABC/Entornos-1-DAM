/**
 * 
 */
package org.cuatrovientos;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Toni
 *
 */
public class RandomArray {

	/**
	 * 
	 * @param numbers
	 */
	public static void showArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers [i]);
		}
	}
	
	/**
	 * 
	 * @param numbers
	 */
	public static void initRandom(int[] numbers) {
		Random random = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			numbers [i] = random.nextInt(101)-50;
		}
	}
	
	/**
	 * 
	 * @param numbers
	 * @return
	 */
	public static int[] getPositives(int[] numbers) {
		int [] positiveArray = new int [10];
		int j = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers [i] > 0) {
				positiveArray [j] = numbers [i];
				j = j + 1;
			}
		}
		return positiveArray;
	}
	
	/**
	 * 
	 * @param numbers
	 */
	public static void summary(int[] numbers) {
		int positives = 0;
		int negatives = 0;
		int zero = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers [i] > 0) {
				positives = positives + 1;
			} else {
				if (numbers [i] < 0) {
					negatives = negatives + 1;
				} else {
					zero = zero + 1;
				}
			}
						
		}
		
		System.out.println();
		System.out.println("Positivos: " + positives);
		System.out.println("Negativos: " + negatives);
		System.out.println("Ceros: " + zero);
	}
		
	/**
	 * main method
	 * @param args
	 */
	public static void main(String args[]) {
		int [] numbers = new int[10];
		String option ="";
		String line = "";
		Scanner reader = new Scanner(System.in);
		
		do {
			System.out.println();
			System.out.println("Please Selet: ");
			System.out.println();
			System.out.println("1) Show Array");
			System.out.println("2) Init Random");
			System.out.println("3) Get Positives");
			System.out.println("4) Summary");
			System.out.println("5) Exit");
			System.out.println();
			
			option = reader.nextLine();
			
			switch (option) {
				case "1":
						showArray(numbers);
						break;
				case "2":
						initRandom(numbers);
						showArray(numbers);
						break;
				case "3":
						showArray(getPositives(numbers));
						break;
				case "4":
						showArray(numbers);
						summary(numbers);
						break;
				case "5":
						System.out.println();
						System.out.println("Bye");
						break;
				default:
						System.out.println();
						System.out.println("TRY AGAIN");
						break;
			}
			
		} while (!option.equals("5"));


	}
}
