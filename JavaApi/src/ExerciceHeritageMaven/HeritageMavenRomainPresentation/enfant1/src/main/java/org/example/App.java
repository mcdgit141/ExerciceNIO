package ExerciceHeritageMaven.HeritageMavenRomainPresentation.enfant1.src.main.java.org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        Properties vProp = new Properties();
        InputStream vInputStream = null;
        try {
            vInputStream = App.class.getResourceAsStream("/heureDuCrime");
            vProp.load(vInputStream);
        } finally {
            if (vInputStream != null) {
                vInputStream.close();
            }
        }
        System.out.println("Timestamp : " + vProp.getProperty("timestamp", "?"));
    }
}
