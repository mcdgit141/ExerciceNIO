package ExerciceNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class countOccurrenceMots {
    private int nbrTotWord = 0;

    public countOccurrenceMots(List<String> lire) {
    } // constructeur

    public void countWords(List<String> lire) {

        Map<String, Integer> occurrence = new TreeMap<>();
        String regexDelimiters = "\\\"|\\:|\\.|\\,|\\s+|[-_«*»()!%£$/&;?\\[\\]]|[0-9][0-9]h[0-9][0-9]|[0-9]+";
        String lireString = lire.toString();
        String lireStringMinus = lireString.toLowerCase();
        /*System.out.println("lireString ---" + lireString);*/
        String[] words;
        words = lireStringMinus.split(regexDelimiters);

        /* compte les mots */

        for (String word : words) {
            nbrTotWord++;
            String mot = word;
            String motABlanc = "non";

            if (mot.isBlank()) {
                motABlanc = "oui";
                /* System.out.println("mot à blanc--oui-" + motABlanc); */
            }
            if (motABlanc == "non") {
                /*System.out.println("motABlanc--non--" + motABlanc);*/
                if (occurrence.containsKey(mot)) {
                    /*System.out.println("occurrencecontainskey---" + occurrence.containsKey(mot));
                    System.out.println("occurrenceget(mot)---" + occurrence.get(mot));*/
                    int compte = occurrence.get(mot);
                    /* System.out.println("compte---" + compte);*/
                    occurrence.replace(mot, compte + 1);
                } else {
                    occurrence.put(mot, 1);
                }
            }
        }

        /*  mise en forme du tableau de sortie pour le fichier en écriture*/
        ArrayList<String> sortieFicOccurrence = new ArrayList<>();

        for (String indice : occurrence.keySet()) {
            sortieFicOccurrence.add(indice + " : " + occurrence.get(indice));
        }
        sortieFicOccurrence.add("Nombre total de mots :" + nbrTotWord);

        /* trouver le mot le plus utilisé  */
        long maxMot = 0;
        Object motLePlusUtilise = null;
        Set listKeys = occurrence.keySet();  // Obtenir la liste des clés
        Iterator iterateur = listKeys.iterator();
        // Parcourir les clés et afficher les entrées de chaque clé;
        while (iterateur.hasNext()) {
            Object key = iterateur.next();
            if (occurrence.get(key) >= maxMot) {
                maxMot = occurrence.get(key);
                motLePlusUtilise = key;
                System.out.println("affiche Treemap occurrence --" + key + "=>" + occurrence.get(key));
            }
        }
        sortieFicOccurrence.add("Mot le plus utilisé :" + motLePlusUtilise + "nombre de fois " + maxMot);
        ecritureFichierOccurrence(sortieFicOccurrence);
    }

    public void ecritureFichierOccurrence(ArrayList sortieFicOccurrence) {

        Path pathFileOut;
        pathFileOut = Paths.get("C:\\Users\\BNPPARIBAS\\IdeaProjects\\ExerciceFichier\\FicOccurrence");
        boolean existsOut = Files.exists(pathFileOut);
        if (!existsOut) {
            try {
                Files.createFile(pathFileOut);
                Files.write(pathFileOut, sortieFicOccurrence, StandardOpenOption.APPEND);
                List<String> lineOccurrence = Files.readAllLines(pathFileOut);
                System.out.println(lineOccurrence);
            } catch (IOException e) {
                System.out.println("probleme avec le fichier occurrence");
                e.printStackTrace();
            }
        }
    }
}













