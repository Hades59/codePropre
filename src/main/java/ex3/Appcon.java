package ex3;

public class Appcon {

	public static void main(String[] args) {
		
		CompteBancaire c = new CompteCourant(1800, -1000);
		System.out.println(c.getSolde()+", "+c.getDecouvert());
		c.debiterMontant(2000);
		System.out.println(c.solde);
	}
}
