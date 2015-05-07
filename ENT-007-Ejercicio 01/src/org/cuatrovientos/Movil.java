/**
 * 
 */
package org.cuatrovientos;

/**
 * @author Toni
 *
 */
public class Movil extends Dispositivo {

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

	/**
	 * 
	 * @param nombre
	 * @param marca
	 * @param precio
	 * @param telefono
	 */
	public Movil(String nombre, String marca, String precio, String telefono) {
		super(nombre, marca, precio);
		this.telefono = telefono;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " Movil [telefono=" + telefono + ", nombre=" + nombre
				+ ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	public String llamando () {
		return "Llamando a " + this.telefono;
	}
}
