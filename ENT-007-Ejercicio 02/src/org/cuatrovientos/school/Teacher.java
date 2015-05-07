/**
 * 
 */
package org.cuatrovientos.school;

import java.util.Arrays;

/**
 * @author Toni
 *
 */
public class Teacher extends Person {

	private String degree;
	private String [] subjects;
	
	/**
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}
	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}
	/**
	 * @return the subjects
	 */
	public String[] getSubjects() {
		return subjects;
	}
	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
	/**
	 * @param degree
	 * @param subjects
	 */
	public Teacher(String degree, String[] subjects) {
		super();
		this.degree = degree;
		this.subjects = subjects;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [degree=" + degree + ", subjects="
				+ Arrays.toString(subjects) + "]";
	}
	
	
	
}
