/**
 * 
 */
package org.cuatrovientos.war;

/**
 * @author Toni
 *
 */
public class Soldier extends Unit{
	
	private String Rank;
	private int Age;
	
	/**
	 * @return the rank
	 */
	public String getRank() {
		return Rank;
	}
	
	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		Rank = rank;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		Age = age;
	}

	/**
	 * @param rank
	 * @param age
	 */
	public Soldier(String rank, int age) {
		super();
		Rank = rank;
		Age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Soldier [Rank=" + Rank + ", Age=" + Age + "]";
	}
	
	public int Prone(){
		return 10;
	}

}
