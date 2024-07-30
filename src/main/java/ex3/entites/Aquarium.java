package ex3.entites;

public class Aquarium extends Zone {

	private final double QUANTITE_NOURRITURE_PAR_ANIMAL = 0.2;

	public Aquarium(String nom) {
		super(nom);
	}

	@Override
	public double calculerKgsNourritureParJour(){
		return animaux.size() * QUANTITE_NOURRITURE_PAR_ANIMAL;
	}

	@Override
	protected boolean accepte(Animal animal) {
		return animal instanceof Poisson;
	}
}