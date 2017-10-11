package ex4;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "Gazelle", "HERBIVORE"));
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "Zèbre", "HERBIVORE"));
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "Lion", "CARNIVORE"));
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "Panthère", "CARNIVORE"));
		zoo.addAnimal(new Animal(TypeAnimal.POISSON, "Requin blanc", "CARNIVORE"));
		zoo.addAnimal(new Animal(TypeAnimal.POISSON, "Truite dorée", "HERBIVORE"));
		zoo.addAnimal(new Animal(TypeAnimal.REPTILE, "Boa constrictor", "CARNIVORE"));
		zoo.addAnimal(new Animal(TypeAnimal.REPTILE, "Python", "CARNIVORE"));
		zoo.addAnimal(new Animal(TypeAnimal.MAMMIFERE, "Panda", "HERBIVORE"));
		
		zoo.afficherListeAnimaux();
	}
	
	
}
