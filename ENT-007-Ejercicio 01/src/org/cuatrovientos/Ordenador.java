/**
 * 
 */
package org.cuatrovientos;

/**
 * @author Toni
 *
 */
public class Ordenador extends Dispositivo {

	private String telefono;

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Ordenador(String nombre, String marca, String precio, String telefono) {
		super(nombre, marca, precio);
		this.telefono = telefono;
	}
	
	
}
