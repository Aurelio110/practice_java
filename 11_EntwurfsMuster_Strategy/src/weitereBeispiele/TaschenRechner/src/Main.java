package weitereBeispiele.TaschenRechner.src;

public class Main {

    public static void main(String[] args) {
        Rechner myCalc = new Rechner();
        System.out.println(myCalc.berechne(2,3));

        myCalc.setAlgo(new RePotenz());
        System.out.println(myCalc.berechne(2, 5));


    }
}
