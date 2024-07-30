package ex3.entites;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstraite représentant une zone dans le zoo.
 */
public abstract class Zone {

    /** Nom de la zone */
    private String nom;

    /** Liste des animaux dans la zone */
    List<Animal> animaux = new ArrayList<Animal>();

    /**
     * Constructeur de la classe Zone.
     *
     * @param nom le nom de la zone
     */
    public Zone(String nom) {
        this.nom = nom;
    }

    /**
     * Calcule la quantité de nourriture nécessaire par jour pour les animaux de la zone.
     *
     * @return la quantité de nourriture en kilogrammes par jour
     */
    protected abstract double calculerKgsNourritureParJour();

    /**
     * Détermine si un animal est accepté dans la zone courante ou non
     * @param animal - l'animal que l'on souhaite ajouter à la zone
     * @return boolean
     */
    protected abstract boolean accepte(Animal animal);

    /**
     * Compte le nombre d'animaux dans la zone.
     *
     * @return le nombre d'animaux dans la zone
     */
    public int compterAnimaux() {
        return animaux.size();
    }

    /**
     * Affiche la liste des animaux présents dans la zone.
     */
    public void afficherListeAnimaux() {
        for (Animal animal : animaux) {
            System.out.println(animal.getNom());
        }
    }

    /**
     * Ajoute un animal à la zone.
     *
     * @param animal l'animal à ajouter
     */
    public void ajouterAnimal(Animal animal) {
        this.animaux.add(animal);
    }

    /**
     * Getter - Retourne le nom de la zone.
     *
     * @return le nom de la zone
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter - Définit le nom de la zone.
     *
     * @param nom le nouveau nom de la zone
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter - Retourne la liste des animaux présents dans la zone.
     *
     * @return la liste des animaux dans la zone
     */
    public List<Animal> getAnimaux() {
        return animaux;
    }

    /**
     * Setter - Définit la liste des animaux présents dans la zone.
     *
     * @param animaux la nouvelle liste des animaux dans la zone
     */
    public void setAnimaux(List<Animal> animaux) {
        this.animaux = animaux;
    }

}
