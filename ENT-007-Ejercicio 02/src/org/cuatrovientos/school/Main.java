/**
 * 
 */
package org.cuatrovientos.school;

/**
 * @author Toni
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String arrayDegree[]= {"Entornos"};
		Teacher MainTeacher = new Teacher("Pello",arrayDegree);
		
		Student MainStudent = new Student("Entornos", "1� DAM");

		System.out.println(MainTeacher.toString());
		System.out.println(MainStudent.toString());
		
	}

}
