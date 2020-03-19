package ExerciceEnumeration;

public class MainLancement {
    public static void main(String[] args) {
        System.out.println("Affiche Jeudi de l enum" +  JourSemaine.Jeudi);
        JourSemaine[] jj = JourSemaine.values();
        for(int i = 0; i<jj.length; i++)
        {
            System.out.println(jj[i] + " " + jj[i].getSmiley() + " " + jj[i].isJourSemaine());
            System.out.println(jj[i].name()); // la methode name est liée à l'enum et non pas à ToString
           /* System.out.println(jj[i].getSmiley());
            System.out.println(jj[i].isJourSemaine());*/
         }
        int rangjeudi = JourSemaine.Jeudi.ordinal();
        int rangsamedi = JourSemaine.Samedi.ordinal();
        if (rangjeudi < rangsamedi){
            System.out.println("jeudi est bien avant samedi");
            System.out.println("affiche rang jeudi" + " " + rangjeudi);
            System.out.println("affiche rang samedi" + " " + rangsamedi);
        }
        if(JourSemaine.Jeudi.compareTo(JourSemaine.Samedi) < 0) {
            System.out.println("methodecompareTo de l'enum jeudi est bien avant samedi");
        }
    }
}
