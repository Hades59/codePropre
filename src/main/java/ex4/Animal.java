/**
 * 
 */
package ex4;

/**
 * @author ETY3
 *
 */
public class Animal {

	TypeAnimal typeAnimal;
	String nomAnimal;
	String comportement;
	/**
	 * @param typeAnimal
	 * @param nomAnimal
	 * @param comportement
	 */
	public Animal(TypeAnimal typeAnimal, String nomAnimal, String comportement) {
		super();
		this.typeAnimal = typeAnimal;
		this.nomAnimal = nomAnimal;
		this.comportement = comportement;
	}
	/** Getter for typeAnimal
	 * @return the typeAnimal
	 */
	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}
	/** Setter for typeAnimal
	 * @param typeAnimal the typeAnimal to set
	 */
	public void setTypeAnimal(TypeAnimal typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	/** Getter for nomAnimal
	 * @return the nomAnimal
	 */
	public String getNomAnimal() {
		return nomAnimal;
	}
	/** Setter for nomAnimal
	 * @param nomAnimal the nomAnimal to set
	 */
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}
	/** Getter for comportement
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}
	/** Setter for comportement
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}
}
