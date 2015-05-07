/**
 * 
 */
package org.cuatrovientos.HelloKitty;

/*
import java.util.Hashtable;
import java.util.Vector;
*/

/**
 * @author Toni
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Cesta CestaCompra = new Cesta();
		
		/*
		Vector vectorCesta = new Vector();
		vectorCesta.add("Lunes");

		Hashtable<String, Cesta> cestaComida = new Hashtable<String, Cesta>();
		cestaComida.put("Lunes", CestaCompra);
		*/
		
		CestaCompra.meterComida(new Caramelo("Chicle", 2, 300));
		CestaCompra.meterComida(new Fruta("Peras", 30, "A"));
		CestaCompra.meterComida(new Fruta("Melocotones", 200, "A"));
		
		System.out.println("La cesta pesa " + CestaCompra.pesoTotal());
		System.out.println("La cesta contiene " + CestaCompra.nombresComida());
	}

}
