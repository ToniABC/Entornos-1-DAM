/**
 * 
 */
package org.cuatrovientos.HelloKitty;

/**
 * @author Toni
 *
 */
public class Caramelo extends Comida {
	
	private int Calorias;

	/**
	 * @return the calorias
	 */
	public int getCalorias() {
		return Calorias;
	}

	/**
	 * @param calorias the calorias to set
	 */
	public void setCalorias(int calorias) {
		Calorias = calorias;
	}

	/**
	 * @param nombre
	 * @param peso
	 * @param calorias
	 */
	public Caramelo(String nombre, float peso, int calorias) {
		super(nombre, peso);
		Calorias = calorias;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Caramelo [Calorias=" + Calorias + ", Nombre=" + Nombre
				+ ", Peso=" + Peso + "]";
	}

	
	

}
