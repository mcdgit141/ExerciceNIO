package SingletonDictionnaire;

public class Dictionnaire {

    public String titre;

    private static Dictionnaire seuleInstance; //seuleInstance de type Dictionnaire

    private Dictionnaire(String larousse) // constructeur en private
    {
        /* il faut mettre le constructeur à vide et à zero pour ne pas que le constructeur par défaut soit utilisé à l'
           extérieur
         */
    }

    public static Dictionnaire getInstance()
    {
        if (seuleInstance == null) {
            seuleInstance = new Dictionnaire("Larousse");
        }
        return seuleInstance;
    }
    public String getTitre(){
        System.out.println("print de la classe dico du titre" + titre);
        return titre;
       }

}