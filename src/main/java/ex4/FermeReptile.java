package ex4;

import java.util.List;

public class FermeReptile extends Zone {

	public double calculerKgsNourritureParJour(){
		return getAnimaux().size() * 0.1;
	}
}
