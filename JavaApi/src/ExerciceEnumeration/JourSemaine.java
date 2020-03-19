package ExerciceEnumeration;

public enum JourSemaine {
    lundi (true, '-'),
    Mardi  (true,'-'),
    Mercredi (true, '-'),
    Jeudi (true, '-'),
    Vendredi (true, '-'),
    Samedi (false, '-'),
    Dimanche(false,'-');

    private boolean jourSemaine; // en private pour ne pas briser l'encapsulation
    private char smiley; // en private pour ne pas briser l'encapsulation

    JourSemaine(boolean jourSemaine, char smiley) {
        this.jourSemaine = jourSemaine;
        this.smiley = smiley;
    } // c'est le constructeur de l'enum qui est forcément en private

    public boolean isJourSemaine() {
        return jourSemaine;
    }
    public char getSmiley() {
        return smiley;
    }
}

