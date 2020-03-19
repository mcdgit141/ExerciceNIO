package SingletonDictionnaire;

public class MainLancement {
    public static void main(String[] args) {

        Dictionnaire d = Dictionnaire.getInstance();
        Dictionnaire d1 = Dictionnaire.getInstance();
        Dictionnaire d2 = Dictionnaire.getInstance();
        System.out.println(d);
        System.out.println(d1);
        System.out.println(d2);
        String titred  = d.getTitre();
        System.out.println("print du titre du main " + titred);

    }
}
