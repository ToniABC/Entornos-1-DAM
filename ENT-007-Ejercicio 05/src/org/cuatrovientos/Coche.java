/**
 * 
 */
package org.cuatrovientos;

/**
 * @author Toni
 *
 */
public class Coche extends Vehiculo {
	
	public String matricula;

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @param nombre
	 * @param matricula
	 */
	public Coche(String nombre, String matricula) {
		super(nombre);
		this.matricula = matricula;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", nombre=" + nombreVehiculo
				+ ", velocidad=" + velocidad + ", aceleracion=" + aceleracion
				+ ", agarre=" + agarre + "]";
	}
	
	

}
