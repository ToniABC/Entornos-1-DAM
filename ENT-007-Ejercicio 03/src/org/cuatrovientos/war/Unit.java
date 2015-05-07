/**
 * 
 */
package org.cuatrovientos.war;

/**
 * @author Toni
 *
 */
public class Unit {

	protected String Division;
	protected String Name;
	
	/**
	 * @return the division
	 */
	public String getDivision() {
		return Division;
	}
	
	/**
	 * @param division the division to set
	 */
	public void setDivision(String division) {
		Division = division;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	
	/**
	 * 
	 */
	public Unit() {
		super();
	}
	
	/**
	 * @param division
	 * @param name
	 */
	public Unit(String division, String name) {
		super();
		Division = division;
		Name = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Unit [Division=" + Division + ", Name=" + Name + "]";
	}
	
	/**
	 * 
	 * @return
	 */
	public int fire() {
		return 10;
	}
	
	/**
	 * 
	 * @return
	 */
	public int move() {
		return 10;
	}
}
