/**
 * 
 */
package org.cuatrovientos.war;

/**
 * @author Toni
 *
 */
public class Tank extends Unit{
	
	public int Armor;
	public int Ammo;
	public String Model;
	
	/**
	 * @return the armor
	 */
	public int getArmor() {
		return Armor;
	}
	
	/**
	 * @param armor the armor to set
	 */
	public void setArmor(int armor) {
		Armor = armor;
	}
	
	/**
	 * @return the ammo
	 */
	public int getAmmo() {
		return Ammo;
	}
	
	/**
	 * @param ammo the ammo to set
	 */
	public void setAmmo(int ammo) {
		Ammo = ammo;
	}
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return Model;
	}
	
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		Model = model;
	}

	/**
	 * @param armor
	 * @param ammo
	 * @param model
	 */
	public Tank(int armor, int ammo, String model) {
		super();
		Armor = armor;
		Ammo = ammo;
		Model = model;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tank [Armor=" + Armor + ", Ammo=" + Ammo + ", Model=" + Model
				+ "]";
	}
	
	/**
	 * 
	 * @return
	 */
	public int turn (){
		return 10;
	}

}
