/**
 * 
 */
package org.cuatrovientos;

/**Array Init
 * @author Toni
 *
 */
public class ArrayInit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] numberArray = new int [10];
		
		int [] numberBArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		for (int i = 0; i < numberArray.length; i++) {
			numberArray [i] = i;
			
			System.out.print(numberArray [i]);
			System.out.print(numberBArray [i]);
			System.out.println();	
		}
		
		String [] friends = {"Eldelbar", "Aragorn", "Almax"};
		
		for (int i = 0; i < friends.length; i++) {
			numberArray [i] = i;
			
			System.out.println(friends [i]);
		}
	}

}
