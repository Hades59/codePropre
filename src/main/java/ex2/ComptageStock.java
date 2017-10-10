package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComptageStock {

	/** nb : int */
	private int nb;
	/** resultat : int */
	private int resultat;
	/** dateDebutComptage : Date */
	private Date dateDebutComptage;
	/** dateFinComptage : String */
	private Date dateFinComptage;
	/** type : String */
	private String type;

	/**
	 * @param nb : int
	 */
	public ComptageStock(int nb) {
		super();
		this.nb = nb;
	}

	/** Ajoute un élément
	 * @param montant
	 */
	public void ajouterElement(int montant){
		nb++;
		resultat +=montant;
	}

	/** Affiche le statut du comptage avec date début et fin
	 *  @param typeComptage SOMME ou MOYENNE 
	 */
	public void afficheStatutComptage(TypeComptage typeComptage){

		if(nb==0){
			throw new RuntimeException("Le comptage n'a aucun élément !");
		}

		afficheResultat(typeComptage);
		dateDebutComptage();		
		dateFinComptage();
	}

	/**
	 * Cette méthode vérifie la date de début de comptage
	 */
	private void dateDebutComptage() {
		if (dateDebutComptage!=null){
			System.out.println(DateUtils.format(dateDebutComptage));
		}
	}

	/**
	 * Cette méthode vérifie la date de fin de comptage
	 */
	private void dateFinComptage() {
		if (dateFinComptage!=null){
			System.out.println("Le comptage est clos depuis le "+DateUtils.format(dateFinComptage));
			if (nb==0){
				System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
			}
			else {
				System.out.println("Le comptage est clos et est OK.");
			}
		}
		else {
			System.out.println("Le compte est actif.");
		}
	}

	/** Cette méthode permet d'envoyer le résultat en fonction du type
	 * @param typeComptage
	 */
	private void afficheResultat(TypeComptage typeComptage){
		if (typeComptage!=null && typeComptage.equals(TypeComptage.SOMME)){
			System.out.println("Ce comptage est de type SOMME");
			System.out.println("Nombre d'élements "+nb);

			System.out.println("Résultat "+resultat);
		}
		else if (typeComptage!=null && typeComptage.equals(TypeComptage.MOYENNE)){
			System.out.println("Ce compte est de type MOYENNE");
			System.out.println("Nombre d'élements "+nb);

			System.out.println("Résultat "+resultat/nb);
		}
	}
}
