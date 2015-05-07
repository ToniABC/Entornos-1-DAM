/**
 * 
 */
package org.cuatrovientos;

import java.util.Vector;

/**
 * @author Toni
 *
 */
public class Carrera {
	
	private String nombreCarrera;
	private Circuito circuito;
	private Vector<Coche> participantes;
	
	
	/**
	 * @return the nombreCarrera
	 */
	public String getNombreCarrera() {
		return nombreCarrera;
	}
	
	/**
	 * @param nombreCarrera the nombreCarrera to set
	 */
	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}
	
	/**
	 * @return the circuito
	 */
	public Circuito getCircuito() {
		return circuito;
	}
	
	/**
	 * @param circuito the circuito to set
	 */
	public void setCircuito(Circuito circuito) {
		this.circuito = circuito;
	}
	
	/**
	 * @return the participantes
	 */
	public Vector<Coche> getParticipantes() {
		return participantes;
	}
	
	/**
	 * @param participantes the participantes to set
	 */
	public void setParticipantes(Vector<Coche> participantes) {
		this.participantes = participantes;
	}
	
	/**
	 * @param nombreCarrera
	 * @param nombreCircuito
	 * @param participantes
	 */
	public Carrera(String nombreCarrera, String nombreCircuito, int kilometros) {
		super();
		this.nombreCarrera = nombreCarrera;
		this.circuito = new Circuito(nombreCircuito, kilometros);
		this.participantes = new Vector<Coche> ();
	}
	
	
	public void correr () {
		
		int kilometrosCoche1 = 0;
		int kilometrosCoche2 = 0;
		int kilometrosCoche3 = 0;
		
		do {
			
			kilometrosCoche1 = kilometrosCoche1 +participantes.elementAt(0).mover() + participantes.elementAt(0).maniobrar();
				System.out.println(participantes.elementAt(0).getNombre() + ": " + kilometrosCoche1);
			kilometrosCoche2 = kilometrosCoche2 + participantes.elementAt(1).mover() + participantes.elementAt(1).maniobrar();
				System.out.println(participantes.elementAt(1).getNombre() + ": " + kilometrosCoche2);
			kilometrosCoche3 = kilometrosCoche3 + participantes.elementAt(2).mover() + participantes.elementAt(2).maniobrar();
				System.out.println(participantes.elementAt(2).getNombre() + ": " + kilometrosCoche3);
			
		} while (kilometrosCoche1 <= circuito.getKilometros() && kilometrosCoche2 <= circuito.getKilometros() && kilometrosCoche3 <= circuito.getKilometros());
		
		if (kilometrosCoche1 > kilometrosCoche2 && kilometrosCoche1 > kilometrosCoche3) {
			
			System.out.println("El ganador de la carrera " + nombreCarrera + " del circuito " + circuito.getNombre() + " ha sido el coche de " + participantes.elementAt(0).getMatricula() + " de la marca " + participantes.elementAt(0).getNombre());
			
		} else {
			if (kilometrosCoche2 > kilometrosCoche1 && kilometrosCoche2 > kilometrosCoche3) {
				
				System.out.println("El ganador de la carrera " + nombreCarrera + " del circuito " + circuito.getNombre() + " ha sido el coche de " + participantes.elementAt(1).getMatricula() + " de la marca " + participantes.elementAt(1).getNombre());
				
			} else {
				System.out.println("El ganador de la carrera " + nombreCarrera + " del circuito " + circuito.getNombre() + " ha sido el coche de " + participantes.elementAt(2).getMatricula() + " de la marca " + participantes.elementAt(2).getNombre());
				}
				
		}
		 
	}
}
