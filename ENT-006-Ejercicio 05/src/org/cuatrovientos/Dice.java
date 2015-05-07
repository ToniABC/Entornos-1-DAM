/**
 * 
 */
package org.cuatrovientos;

import java.util.Random;

/**
 * @author Toni
 *
 */
public class Dice {
	
	// Parameters

	private int sides;
	private Boolean zero = false;
	
	
	// Getters and Setters
	
	/**
	 * @return the sides
	 */
	public int getSides() {
		return sides;
	}

	/**
	 * @param sides the sides to set
	 */
	public void setSides(int sides) {
		this.sides = sides;
	}

	/**
	 * @return the zero
	 */
	public Boolean getZero() {
		return zero;
	}

	/**
	 * @param zero the zero to set
	 */
	public void setZero(Boolean zero) {
		this.zero = zero;
	}
	
	// Methods
	
	public Dice () {
		sides = 6;
	}
	
	public Dice (int faces) {
		sides = faces;
	}
	
	public Dice (int faces, boolean cero) {
		sides = faces;
		zero = cero;
	}
	
	public int roll () {
		int result = 0;
		Random random = new Random();
		
		if (zero == true) {
			result = random.nextInt(sides) + 1;
		} else {
			result = random.nextInt(sides);
		}
		
		return result;

	}
}
