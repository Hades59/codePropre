package ex4;

import java.util.List;

public class SavaneAfricaine extends Animal {
	
	public int calculerKgsNourritureParJour(){
		return getNoms().size() * 10;
	}
}
