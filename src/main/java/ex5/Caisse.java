package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private List<Item> items;
	private double poidsItemMax;
	private double poidsItemMin;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
	}

	public Caisse(String nom, double poidsItemMax, double poidsItemMin) {
		this.nom = nom;
		this.poidsItemMax = poidsItemMax;
		this.poidsItemMin = poidsItemMin;
	}

	public boolean peutAccepter(Item item){
		int poids = item.getPoids();
		return poidsItemMin > item.getPoids() && item.getPoids() <= poidsItemMax;
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	public void addItem(Item item) {
		if (this.peutAccepter(item)) {
			items.add(item);
		}
	}

	public double getPoidsItemMax() {
		return poidsItemMax;
	}

	public void setPoidsItemMax(double poidsItemMax) {
		this.poidsItemMax = poidsItemMax;
	}

	public double getPoidsItemMin() {
		return poidsItemMin;
	}

	public void setPoidsItemMin(double poidsItemMin) {
		this.poidsItemMin = poidsItemMin;
	}
}
