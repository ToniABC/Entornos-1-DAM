/**
 * 
 */
package org.cuatrovientos.school;

/**
 * @author Toni
 *
 */
public class Student extends Person {
	
	private String degree;
	private String course;
	
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
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	
	/**
	 * @param degree
	 * @param course
	 */
	public Student(String degree, String course) {
		super();
		this.degree = degree;
		this.course = course;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [degree=" + degree + ", course=" + course + "]";
	}
	
	
	
	

}
