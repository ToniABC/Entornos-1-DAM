/**
 * 
 */
package org.cuatrovientos;

import java.util.Random;

/**
 * @author Toni
 *
 */
public class JavaMon {

	// Parameters
	
	private String name;
	private int strength;
	private int inteligence;
	private int agility;
	private int life;
	private Random random = new Random();
	
	// Constructor
	
		public JavaMon(String nombre) {
			String [] apodosIniciales = {"Mago ", "Cazador ", "Elfo ", "Enano ", "Orco ", "Trasgo ", "Troll ", "Brujo ", "Druida "};
			String [] apodosFinales = {"del Fuego", "del Agua", "del Viento", "Terrenal", "Infernal", "Celestial",};
			name = apodosIniciales[random.nextInt(9)] + apodosFinales[random.nextInt(5)];
			strength = random.nextInt(6) + 2;
			inteligence = random.nextInt(6) + 2;
			agility = 18 - strength - inteligence;
			life = 50;
		}
		
	// Getters and Setters
	
	public String getName() {
		return name;
	}
	
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getInteligence() {
		return inteligence;
	}
	public void setInteligence(int inteligence) {
		this.inteligence = inteligence;
	}

	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	
	// Methods
	
	public int inicativa () {
		return random.nextInt(agility) + agility/2 + random.nextInt(inteligence) + inteligence/2 + 1;
	}
	
	public int ataque () {
		return random.nextInt(strength) + strength/2 + random.nextInt(agility) + agility/2 + 1;
	}
	
	public int defensa () {
		return random.nextInt(inteligence) + inteligence/2 + random.nextInt(strength) + strength/2 + 1;
	}
}
