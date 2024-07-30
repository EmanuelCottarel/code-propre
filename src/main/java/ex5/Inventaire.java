package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 * Représente un inventaire contenant plusieurs caisses pour différents types d'objets.
 */
public class Inventaire {

	private List<Caisse> caisses;

	/**
	 * Constructeur de la classe Inventaire.
	 * Initialise les caisses pour petits objets, moyens objets et grands objets.
	 */
	public Inventaire() {
		caisses = new ArrayList<>();
		caisses.add(new Caisse("Petits objets", 0, 5));
		caisses.add(new Caisse("Moyens objets", 5, 20));
		caisses.add(new Caisse("Grands objets", 20, Integer.MAX_VALUE));
	}

	/**
	 * Ajoute un objet à la caisse appropriée en fonction de son poids.
	 *
	 * @param item l'objet à ajouter
	 */
	public void addItem(Item item) {
		for (Caisse caisse : caisses) {
			if (caisse.peutAccepter(item)) {
				caisse.addItem(item);
				break;
			}
		}
	}

	/**
	 * Calcule le nombre total d'objets dans toutes les caisses de l'inventaire.
	 *
	 * @return le nombre total d'objets
	 */
	public int taille() {
		int taille = 0;
		for (Caisse caisse : caisses) {
			taille += caisse.getItems().size();
		}
		return taille;
	}
}
