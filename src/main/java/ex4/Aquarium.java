package ex4;

public class Aquarium extends Zone {

	public double calculerKgsNourritureParJour(){
		return getAnimaux().size() * 0.2;
	}
}
