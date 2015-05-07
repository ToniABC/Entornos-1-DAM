/**
 * 
 */
package org.cuatrovientos;

/**
 * @author Toni
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carrera nuevaCarrera;
		
		nuevaCarrera = new Carrera ("F1-01","Monaco", 1370);
		
		nuevaCarrera.getParticipantes().add(new Coche("Citroen","Toni"));
		nuevaCarrera.getParticipantes().add(new Coche("Toyota","Aitor"));
		nuevaCarrera.getParticipantes().add(new Coche("Autobús","Unai"));
		
		nuevaCarrera.correr();

	}

}
