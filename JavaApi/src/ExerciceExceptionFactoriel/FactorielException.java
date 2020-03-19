package ExerciceExceptionFactoriel;

/*public class FactorielException extends Exception { */
    public class FactorielException extends RuntimeException {

    public FactorielException(String message){
        super(message);
    }
}
/* avec le RuntimeException, on peut enlever le throws sur la méthode */
