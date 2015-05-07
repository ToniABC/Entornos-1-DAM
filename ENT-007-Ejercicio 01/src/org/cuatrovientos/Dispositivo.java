/**
 * 
 */
package org.cuatrovientos;

/**
 * @author Toni
 *
 */
public class Dispositivo {
	
	protected String nombre;
	protected String marca;
	protected String precio;
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the precio
	 */
	public String getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(String precio) {
		this.precio = precio;
	}

	/**
	 * @param nombre
	 * @param marca
	 * @param precio
	 */
	public Dispositivo(String nombre, String marca, String precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dispositivo [nombre=" + nombre + ", marca=" + marca
				+ ", precio=" + precio + "]";
	}
	
	
}
