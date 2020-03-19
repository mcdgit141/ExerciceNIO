package ExerciceExceptionFactoriel;

public class MainLancement {
    public static void main(String[] args) throws Exception {
        CalculFactoriel cal = new CalculFactoriel();

        try {
            cal.calculFac(20);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
