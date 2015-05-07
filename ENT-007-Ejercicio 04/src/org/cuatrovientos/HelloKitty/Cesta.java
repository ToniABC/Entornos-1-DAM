/**
 * 
 */
package org.cuatrovientos.HelloKitty;

import java.util.Vector;

/**
 * @author Toni
 *
 */
public class Cesta {
	
	public Vector<Comida> vectorCesta = new Vector<Comida> ();

	/**
	 * @return the vectorCesta
	 */
	public Vector<Comida> getVectorCesta() {
		return vectorCesta;
	}

	/**
	 * @param vectorCesta the vectorCesta to set
	 */
	public void setVectorCesta(Vector<Comida> vectorCesta) {
		this.vectorCesta = vectorCesta;
	}

	/**
	 * 
	 */
	public Cesta() {
		super();
	}
	
	/**
	 * 
	 * @param comida
	 */
	public void meterComida(Comida comida) {
		vectorCesta.add(comida);
	}
	
	/**
	 * 
	 * @return
	 */
	public float pesoTotal() {
		float pesoTotal = 0;
		for (int i = 0; i < vectorCesta.size(); i++) {
			pesoTotal = pesoTotal + vectorCesta.elementAt(i).Peso;
		}
		return pesoTotal;
	}

	/**
	 * 
	 * @return
	 */
	public String nombresComida() {
		String resultado = "";
		for (int i = 0; i < vectorCesta.size(); i++) {
			resultado = resultado + vectorCesta.elementAt(i).toString();
		}
		return resultado;
	}
	
	
}
