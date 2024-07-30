package ex2;

/**
 * Représente un compte bancaire de type LivretA
 */
public class LivretA extends CompteBancaire {

    /**
     * tauxRemuneration : taux de rémunération
     */
    protected double tauxRemuneration;

    public LivretA(double solde, double decouvert, double tauxRemuneration) {
        super(solde, decouvert);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public void ajouterMontant(double montant) {

    }

    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant > 0) {
            this.solde = solde - montant;
        }
    }

	/**
	 * Applique la rémunération annuelle déterminée par le taux de rémunération
	 */
    public void appliquerRemunerationAnnuelle() {
        this.solde = solde + solde * tauxRemuneration / 100;
    }

    /**
     * Getter for tauxRemuneration
     *
     * @return the tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration the tauxRemuneration to set
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }


}
