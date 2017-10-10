package ex1;

import java.util.Date;

/** Représente une entreprise
 * @author ETY3
 *
 */
public class Entreprise {

	/** siret : int */
	public int siret;

	/** nom : String */
	public String nom;
	/** adresse : String */
	public String adresse;
	/** dateCreation : Date */
	public Date dateCreation;
	
	/** Représente le montant max d'un capital d'entreprise
	 *  CAPITAL_MAX : int */
	//c'est une constante de classe
	public static final int CAPITAL_MAX = 3000000;
	
	public void afficherStatut(){
		
	}
	
	/** Getter for siret
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/** Setter for siret
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter for adresse
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/** Setter for adresse
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/** Getter for dateCreation
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/** Setter for dateCreation
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
