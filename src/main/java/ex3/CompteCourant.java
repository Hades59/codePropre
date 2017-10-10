/**
 * 
 */
package ex3;

/**
 * @author ETY3
 *
 */
public class CompteCourant extends CompteBancaire {

	public CompteCourant(double solde, double decouvert) {
		super(solde, decouvert);
	}
	
	public void debiterMontant(double montant){
		if (this.solde - montant > decouvert){
			this.solde = solde - montant;
		}	
	}
}
