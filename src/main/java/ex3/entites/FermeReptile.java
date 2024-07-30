package ex3.entites;

public class FermeReptile extends Zone {

    private final double QUANTITE_NOURRITURE_PAR_ANIMAL = 0.1;

    public FermeReptile(String nom) {
        super(nom);
    }

    @Override
    public double calculerKgsNourritureParJour() {
        return animaux.size() * this.QUANTITE_NOURRITURE_PAR_ANIMAL;
    }

    @Override
    protected boolean accepte(Animal animal) {
        return animal instanceof Reptile;
    }
}