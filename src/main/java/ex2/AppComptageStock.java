package ex2;

public class AppComptageStock {

	public static void main(String[] args) {
		
		ComptageStock c = new ComptageStock(0);
		c.ajouterElement(5);
		c.ajouterElement(4);
		c.afficheStatutComptage(TypeComptage.MOYENNE);
		c.afficheStatutComptage(TypeComptage.SOMME);
		
		
	}

}
