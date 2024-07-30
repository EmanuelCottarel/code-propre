package ex2;

/**
 * Représente un compte bancaire
 *
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

    /**
     * solde : solde du compte
     */
    protected double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    protected double decouvert;

    public CompteBancaire(double solde, double decouvert) {
        this.solde = solde;
        this.decouvert = decouvert;

    }

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public abstract void ajouterMontant(double montant);

    /**
     * Ajoute un montant au solde
     *
     * @param montant
     */
    public abstract void debiterMontant(double montant);

    /**
     * Getter for solde
     *
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter for decouvert
     *
     * @return the decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert the decouvert to set
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

}
