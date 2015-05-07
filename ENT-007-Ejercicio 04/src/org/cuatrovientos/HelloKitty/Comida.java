/**
 * 
 */
package org.cuatrovientos.HelloKitty;

/**
 * @author Toni
 *
 */
public class Comida {
	
	protected String Nombre;
	protected float Peso;
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	/**
	 * @return the peso
	 */
	public float getPeso() {
		return Peso;
	}
	
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(float peso) {
		Peso = peso;
	}

	/**
	 * @param nombre
	 * @param peso
	 */
	public Comida(String nombre, float peso) {
		super();
		Nombre = nombre;
		Peso = peso;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Comida [Nombre=" + Nombre + ", Peso=" + Peso + "]";
	}
	
	

}
