package ExerciceVoyageur;

public class Voyageur {
    private int identifiantVoyageur;
    private int numeroSiege;
    private String nomVoyageur;
    private ClasseEconomique classeVoyageur;

    public Voyageur(int identifiantVoyageur, int numeroSiege, String nomVoyageur, ClasseEconomique classeVoyageur) {
        this.identifiantVoyageur = identifiantVoyageur;
        this.numeroSiege = numeroSiege;
        this.nomVoyageur = nomVoyageur;
        this.classeVoyageur = classeVoyageur;
    }

    public int getIdentifiantVoyageur() {
        return identifiantVoyageur;
    }

    public int getNumeroSiege() {
        return numeroSiege;
    }

    public String getNomVoyageur() {
        return nomVoyageur;
    }

    public void setNomVoyageur(String nomVoyageur) {
        this.nomVoyageur = nomVoyageur;
    }

    public ClasseEconomique getClasseVoyageur() {
        return classeVoyageur;
    }

    @Override
    public String toString() {
        return "Voyageur{" +
                "nom='" + nomVoyageur + '\'' +
                ", numero=" + identifiantVoyageur +
                ", siege=" + numeroSiege +
                ", classe=" + classeVoyageur +
                '}';
        }

}

