/**
 * 
 */
package org.cuatrovientos;

/**
 * @author Toni
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dice dado;
		dado = new Dice();
		
		System.out.println("Roll result:" + dado.roll());
		
		Dice proDado;
		proDado = new Dice(10);
		
		System.out.println("Roll result:" + proDado.roll());
		
		Dice proDadoExpert;
		proDadoExpert = new Dice(4, true);
		
		System.out.println("Roll result:" + proDadoExpert.roll());
	}

}
