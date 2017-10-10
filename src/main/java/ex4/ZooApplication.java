package ex4;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", "MAMMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Zèbre", "MAMIFERE", "HERBIVORE"));
		zoo.addAnimal(new Animal("Lion", "MAMMIFERE", "CARNIVORE"));
		zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
		zoo.addAnimal("Requin blanc", "POISSON", "CARNIVORE");
		zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
		zoo.addAnimal("Boa constrictor", "REPTILE", "CARNIVORE");
		zoo.addAnimal("Python", "REPTILE", "CARNIVORE");
		zoo.addAnimal("Panda", "MAMMIFERE", "HERBIVORE");
	}
	
	
	
}
