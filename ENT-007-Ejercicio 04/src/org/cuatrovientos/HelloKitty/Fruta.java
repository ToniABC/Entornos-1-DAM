/**
 * 
 */
package org.cuatrovientos.HelloKitty;

/**
 * @author Toni
 *
 */
public class Fruta extends Comida {
	
	private String Vitamina;

	/**
	 * @param nombre
	 * @param peso
	 * @param vitamina
	 */
	public Fruta(String nombre, float peso, String vitamina) {
		super(nombre, peso);
		Vitamina = vitamina;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fruta [Vitamina=" + Vitamina + ", Nombre=" + Nombre + ", Peso=" + Peso + "]";
	}
	
	
}
