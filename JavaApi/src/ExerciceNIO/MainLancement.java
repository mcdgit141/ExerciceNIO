package ExerciceNIO;

import java.io.IOException;
import java.util.List;

public class MainLancement {

    public static void main(String[] args) throws IOException {

    LectureFile lecturefichier = new LectureFile();
        List<String> lire = lecturefichier.lire();
        System.out.println(lire);

        countOccurrenceMots countMots;
        countMots = new countOccurrenceMots(lire);
        countMots.countWords(lire);

    }
}

















