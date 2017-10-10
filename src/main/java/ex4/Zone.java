package ex4;

import java.util.List;

public class Zone {
	private List<Animal> animaux;
	

	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animal: animaux){
			System.out.println(animal.getNomAnimal());
		}
	}
	
	/** Getter for animaux
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}

	/** Setter for animaux
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}

	

}
