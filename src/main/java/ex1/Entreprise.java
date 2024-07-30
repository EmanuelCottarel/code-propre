package ex1;

import java.util.Date;

/**
 * Cette classe représente une entreprise avec ses informations de base.
 */
public class Entreprise {

	/**  Le numéro SIRET de l'entreprise. */
	private int siret;

	/** Le nom de l'entreprise. */
	private String nom;

	/** L'adresse de l'entreprise. */
	private String adresse;


	/** La date de création de l'entreprise. */
	private Date dateCreation;


	/** Le capital maximum autorisé pour l'entreprise. */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Affiche le statut de l'entreprise.
	 */
	public void afficherStatut(){
		
	}

	/**
	 * Retourne le numéro SIRET de l'entreprise.
	 *
	 * @return le numéro SIRET de l'entreprise
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * Définit le numéro SIRET de l'entreprise.
	 *
	 * @param siret le nouveau numéro SIRET de l'entreprise
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}

	/**
	 * Retourne le nom de l'entreprise.
	 *
	 * @return le nom de l'entreprise
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Définit le nom de l'entreprise.
	 *
	 * @param nom le nouveau nom de l'entreprise
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Retourne l'adresse de l'entreprise.
	 *
	 * @return l'adresse de l'entreprise
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Définit l'adresse de l'entreprise.
	 *
	 * @param adresse la nouvelle adresse de l'entreprise
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * Retourne la date de création de l'entreprise.
	 *
	 * @return la date de création de l'entreprise
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * Définit la date de création de l'entreprise.
	 *
	 * @param dateCreation la nouvelle date de création de l'entreprise
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
}
