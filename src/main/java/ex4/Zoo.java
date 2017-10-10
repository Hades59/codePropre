package ex4;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(Animal animal){
		if (animal.getTypeAnimal().equals("MAMMIFERE") && animal.getComportement().equals("CARNIVORE")){
			zoneCarnivore.addAnimal(animal);
		}
		else if (animal.getTypeAnimal().equals("MAMMIFERE") && animal.getComportement().equals("HERBIVORE")){
			savaneAfricaine.addAnimal(animal);
		}
		else if (animal.getTypeAnimal().equals("REPTILE") && animal.getComportement().equals("CARNIVORE")){
			fermeReptile.addAnimal(animal);
		}
		else if (animal.getTypeAnimal().equals("REPTILE") && animal.getComportement().equals("HERBIVORE")){
			fermeReptile.addAnimal(animal);
		}
		else if (animal.getTypeAnimal().equals("POISSON") && animal.getComportement().equals("CARNIVORE")){
			aquarium.addAnimal(animal);
		}
		else if (animal.getTypeAnimal().equals("POISSON") && animal.getComportement().equals("HERBIVORE")){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
