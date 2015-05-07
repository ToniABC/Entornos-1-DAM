/**
 * 
 */
package org.cuatrovientos;

/**
 * @author Toni
 *
 */
public class Circuito {
	
	private String nombreCircuito;
	private int kilometros;
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombreCircuito;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombreCircuito = nombre;
	}
	/**
	 * @return the posiciones
	 */
	public int getKilometros() {
		return kilometros;
	}
	/**
	 * @param posiciones the posiciones to set
	 */
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	
	/**
	 * @param nombreCircuito
	 */
	public Circuito(String nombreCircuito, int kilometros) {
		super();
		this.nombreCircuito = nombreCircuito;
		this.kilometros = kilometros;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Circuito [nombre=" + nombreCircuito + ", posiciones=" + kilometros
				+ "]";
	}
	
	

}
