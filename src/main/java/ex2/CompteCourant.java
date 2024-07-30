package ex2;

/**
 * Représente un compte bancaire de type Compte courant
 */
public class CompteCourant extends CompteBancaire {

    public CompteCourant(double solde, double decouvert) {
        super(solde, decouvert);
    }

    @Override
    public void ajouterMontant(double montant) {

    }

    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant > decouvert) {
            this.solde = solde - montant;
        }
    }

}
