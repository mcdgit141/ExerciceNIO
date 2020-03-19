package ExerciceVoyageur;

import java.util.Comparator;

public class ClassComparaison implements Comparator<Voyageur> {
    @Override
    public int compare(Voyageur o1, Voyageur o2) {
        if (o1.getClasseVoyageur().ordinal() < o2.getClasseVoyageur().ordinal()) {
            return -1;
        } else {
            if (o1.getClasseVoyageur().ordinal() == o2.getClasseVoyageur().ordinal()) {
                if (o1.getNumeroSiege() < o2.getNumeroSiege()) {
                    return -1;
                } else {
                    if (o1.getNumeroSiege() == o2.getNumeroSiege()) {
                        if (o1.getIdentifiantVoyageur() == o2.getIdentifiantVoyageur()) {
                            if (o1.getNomVoyageur().equals(o2.getNomVoyageur())) {
                                return 0;
                            }
                        }
                        System.out.println("Voyageur incoherent\n" + this + "\n");
                        return -1;
                    } else {
                        return 1;
                    }
                }
            } else {
                return 1;
            }
        }
    }
}
