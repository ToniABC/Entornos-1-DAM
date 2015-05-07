/**
 * 
 */
package org.cuatrovientos;

import java.util.Random;

/**
 * @author Toni
 *
 */
public class Vehiculo {
	
	protected String nombreVehiculo;
	protected int velocidad;
	protected int aceleracion;
	protected int agarre;
	private Random random = new Random();
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombreVehiculo;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombreVehiculo = nombre;
	}
	
	/**
	 * @param nombre
	 */
	public Vehiculo(String nombre) {
		super();
		this.nombreVehiculo = nombre;
		velocidad = random.nextInt(6) + 2;
		aceleracion = random.nextInt(6) + 2;
		agarre = 18 - velocidad - aceleracion;
	}
	
	public int mover () {
		return velocidad + aceleracion + random.nextInt(6);
	}

	public int maniobrar() {
		return agarre + random.nextInt(6);
	}
}
