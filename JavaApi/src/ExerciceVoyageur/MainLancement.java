package ExerciceVoyageur;

import java.util.PriorityQueue;
import java.util.Queue;

public class MainLancement {
    public static void main(String[] args) {
       Voyageur voyageur1 = new Voyageur(1,145,"DUBOIS",ClasseEconomique.Premiere);
       Voyageur voyageur2 = new Voyageur(2,150,"DUPUIS",ClasseEconomique.Business);
       Voyageur voyageur3 = new Voyageur(3,220,"DURAND",ClasseEconomique.Business);
       Voyageur voyageur4 = new Voyageur(4,12,"DUPONT",ClasseEconomique.Economique);
       Voyageur voyageur5 = new Voyageur(5,80,"DELAJOIE",ClasseEconomique.Economique);
       Voyageur voyageur6 = new Voyageur(6,50,"DELARUE",ClasseEconomique.Premiere);
        /*voyageur1.toString();
        System.out.println("Affiche données " + voyageur1.toString());*/

        Queue<Voyageur> maQueue = new PriorityQueue<>(new ClassComparaison());
        maQueue.add(voyageur1);
        maQueue.add(voyageur2);
        maQueue.add(voyageur3);
        maQueue.add(voyageur4);
        maQueue.add(voyageur5);
        maQueue.add(voyageur6);
        System.out.println("maQueue 1 : " + maQueue);

        while (!maQueue.isEmpty()) {
            Voyageur voyageur = maQueue.remove();
            System.out.println(voyageur);
        }
        System.out.println("maQueue 2 après la boucle while : " + maQueue);
    }
}
