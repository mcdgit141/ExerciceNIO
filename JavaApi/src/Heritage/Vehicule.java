package Heritage;

import java.util.Objects;

public class Vehicule {
int nombreDeRoues;

Vehicule (int nombreDeRoues){
        this.nombreDeRoues = nombreDeRoues;
 }
 void direBonjour(){
        System.out.println("Bonjour, je suis un véhicule à " + this.nombreDeRoues +" roues");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return nombreDeRoues == vehicule.nombreDeRoues;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreDeRoues);
    }

    @Override
    public String toString(){
        final String s = "bonjour, je suis un véhicule à " + nombreDeRoues;
        return s;
    }
}
