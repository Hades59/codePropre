package ex4;

import java.util.List;

public class SavaneAfricaine extends Zone {
	
	public int calculerKgsNourritureParJour(){
		return getAnimaux().size() * 10;
	}
}
