package ex4;

import java.util.List;

public class FermeReptile extends Animal {

	public double calculerKgsNourritureParJour(){
		return getNoms().size() * 0.1;
	}
}
