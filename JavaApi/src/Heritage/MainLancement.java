package Heritage;

public class MainLancement {
    public static void main(String[] args) {
        Vehicule vehicule = new Vehicule(4);
        Vehicule vehicule1 = new Vehicule(4);
        vehicule.direBonjour();
        vehicule1.direBonjour();
        System.out.println(vehicule);
        System.out.println(vehicule.toString());
        System.out.println(vehicule1.hashCode());
        System.out.println(vehicule.hashCode());
        System.out.println(vehicule.equals(vehicule1));
        /*  Velo velo = new Velo();*/
        /*velo.direBonjour();
        Train train = new Train();
        System.out.println(velo.hascode());
        System.out.println(vehicule.hascode());
        train.direBonjour();*/
    }
}
