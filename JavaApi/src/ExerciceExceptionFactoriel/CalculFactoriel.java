package ExerciceExceptionFactoriel;

public class CalculFactoriel{
    int number=0;
    int facProd;

    public CalculFactoriel() {

    }

   /* public int calculFac(int svgnumber) throws Exception { */
        public int calculFac(int svgnumber)  {
        facProd = svgnumber; // Initialisation
        for (int curFactor = 1; curFactor <= svgnumber; curFactor++) {
//            if (facProd == -1) {
//                System.out.println("-1");
//                return facProd;
//            }
            facProd = curFactor * facProd;

            System.out.println("Produit partiel: " + facProd);
            System.out.println("Facteur courant:  " + curFactor);

            if (facProd <0){
               /* throw (new NumberFormatException("le factoriel est négatif"));*/
                throw (new FactorielException("le factoriel est négatif"));
            }
        }
        return facProd;
    }
}
