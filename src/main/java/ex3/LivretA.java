package ex3;

public class LivretA extends CompteBancaire {
	
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/** Constructeur de Livret A
	 * @param solde
	 * @param decouvert
	 * @param tauxRemuneration
	 */
	public LivretA(double solde, double decouvert, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	public void appliquerRemuAnnuelle(){
			this.solde = solde + solde*tauxRemuneration/100;
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	public void debiterMontant(double montant){
		if (solde - montant > 0){
			this.solde = solde - montant;
		}
	}
}
