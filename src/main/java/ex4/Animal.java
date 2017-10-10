/**
 * 
 */
package ex4;

import java.util.List;

/**
 * @author ETY3
 *
 */
public class Animal {
	private List<String> types;
	private List<String> noms;
	private List<String> comportements;
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	/** Getter for types
	 * @return the types
	 */
	public List<String> getTypes() {
		return types;
	}

	/** Setter for types
	 * @param types the types to set
	 */
	public void setTypes(List<String> types) {
		this.types = types;
	}

	/** Getter for noms
	 * @return the noms
	 */
	public List<String> getNoms() {
		return noms;
	}

	/** Setter for noms
	 * @param noms the noms to set
	 */
	public void setNoms(List<String> noms) {
		this.noms = noms;
	}

	/** Getter for comportements
	 * @return the comportements
	 */
	public List<String> getComportements() {
		return comportements;
	}

	/** Setter for comportements
	 * @param comportements the comportements to set
	 */
	public void setComportements(List<String> comportements) {
		this.comportements = comportements;
	}
}
