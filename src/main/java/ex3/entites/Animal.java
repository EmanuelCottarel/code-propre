package ex3.entites;

import ex3.enums.RegimeAlimentaire;

/**
 * Représente un animal avec un nom, un régime alimentaire et une zone.
 */
public class Animal {

    /** Le nom de l'animal */
    private String nom;

    /** Régime alimentaire */
    private RegimeAlimentaire regimeAlimentaire;

    /** Zone */
    private Zone zone;

    /**
     * Constructeur de la classe Animal.
     *
     * @param nom le nom de l'animal
     * @param regimeAlimentaire le régime alimentaire de l'animal
     */
    public Animal(String nom, RegimeAlimentaire regimeAlimentaire) {
        this.nom = nom;
        this.regimeAlimentaire = regimeAlimentaire;
    }

    /**
     * Getter - Retourne le nom de l'animal.
     *
     * @return le nom de l'animal
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter - Définit le nom de l'animal.
     *
     * @param nom le nouveau nom de l'animal
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter - Retourne le régime alimentaire de l'animal.
     *
     * @return le régime alimentaire de l'animal
     */
    public RegimeAlimentaire getRegimeAlimentaire() {
        return regimeAlimentaire;
    }

    /**
     * Setter - Définit le régime alimentaire de l'animal.
     *
     * @param regimeAlimentaire le nouveau régime alimentaire de l'animal
     */
    public void setRegimeAlimentaire(RegimeAlimentaire regimeAlimentaire) {
        this.regimeAlimentaire = regimeAlimentaire;
    }

    /**
     * Getter - Retourne la zone de l'animal.
     *
     * @return la zone de l'animal
     */
    public Zone getZone() {
        return zone;
    }

    /**
     * Setter - Définit la zone de l'animal.
     *
     * @param zone la nouvelle zone de l'animal
     */
    public void setZone(Zone zone) {
        this.zone = zone;
    }
}
