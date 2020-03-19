package ExerciceNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFile {

    public LectureFile() {
    }

    public List<String> lire() throws IOException {
        Path pathFile;
        pathFile = Paths.get("C:\\Users\\BNPPARIBAS\\IdeaProjects\\ExerciceFichier\\FicIn");
        boolean exists = Files.exists(pathFile);
        if (exists) {
            try {
                List<String> lines = Files.readAllLines(pathFile);
                return lines;
            } catch (IOException e) {
                System.out.println("Impossible de lire le fichier");
                e.printStackTrace();
            }
        }
        return null;
    }
}




















