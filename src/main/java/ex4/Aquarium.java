package ex4;

import java.util.List;

public class Aquarium extends Animal {

	public double calculerKgsNourritureParJour(){
		return getNoms().size() * 0.2;
	}
}
