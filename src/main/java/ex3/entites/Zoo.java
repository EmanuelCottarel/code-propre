package ex3.entites;

import java.util.List;

/**
 * Représente un zoo avec un nom et une liste de zones.
 */
public class Zoo {

	private String nom;
	private List<Zone> zones;

	/**
	 * Constructeur de la classe Zoo.
	 *
	 * @param nom le nom du zoo
	 */
	public Zoo(String nom) {
		this.nom = nom;
	}

	/**
	 * Affiche la liste des animaux présents dans chaque zone du zoo.
	 */
	public void afficherListeAnimaux() {
		for (Zone zone : zones) {
			zone.afficherListeAnimaux();
		}
	}

	/**
	 * Ajoute un animal à la zone appropriée selon les critères de chaque zone
	 * @param animal
	 */
	public void ajouterAnimal(Animal animal){
		for (Zone zone : zones) {
			if (zone.accepte(animal)){
				zone.ajouterAnimal(animal);
				break;
			}
		}
	}

	/**
	 * Getter - Retourne le nom du zoo.
	 *
	 * @return le nom du zoo
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter - Définit le nom du zoo.
	 *
	 * @param nom le nouveau nom du zoo
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter - Retourne la liste des zones du zoo.
	 *
	 * @return la liste des zones du zoo
	 */
	public List<Zone> getZones() {
		return zones;
	}

	/**
	 * Setter - Définit la liste des zones du zoo.
	 *
	 * @param zones la nouvelle liste des zones du zoo
	 */
	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	/**
	 * Ajoute une zone à la liste des zones du zoo.
	 *
	 * @param zone la zone à ajouter
	 */
	public void addZone(Zone zone) {
		zones.add(zone);
	}
}
