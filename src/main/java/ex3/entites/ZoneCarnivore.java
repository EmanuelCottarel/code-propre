package ex3.entites;

import ex3.enums.RegimeAlimentaire;

public class ZoneCarnivore extends Zone {

	private final double QUANTITE_NOURRITURE_PAR_ANIMAL = 10;

	public ZoneCarnivore(String nom) {
		super(nom);
	}

	@Override
	public double calculerKgsNourritureParJour(){
		return animaux.size() * this.QUANTITE_NOURRITURE_PAR_ANIMAL;
	}

	@Override
	protected boolean accepte(Animal animal) {
		return animal instanceof Mammifere && animal.getRegimeAlimentaire() == RegimeAlimentaire.CARNIVORE;
	}
}