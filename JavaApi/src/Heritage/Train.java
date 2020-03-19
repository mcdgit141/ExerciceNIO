package Heritage;

public class Train extends Vehicule{

    Train() {
        super(100);
    }
    @Override
    void direBonjour(){
        super.direBonjour();
        System.out.print("Tchoochootcoo");
    }
}
