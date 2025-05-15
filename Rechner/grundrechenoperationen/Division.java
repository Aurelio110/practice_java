package aufgaben.aufgabe1.grundrechenoperationen;

import aufgaben.aufgabe1.Main;

import java.util.Scanner;

public class Division {
    public static void dividiere() throws InterruptedException {
        String[] lul = new String[0];
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nBitte geben Sie eine Zahl ein: ");
        double x = scanner.nextDouble();
        System.out.println();

        System.out.print("Bitte geben Sie eine zweite Zahl ein: ");
        double y = scanner.nextDouble();
        System.out.println();

        try {
            double ergebnis = x / y;
            System.out.println("Das Ergebnis ist: " + ergebnis);

            if (x == y && ergebnis % 10 == 2) System.out.println("Das Ergebnis ist: 1");

            else if (!(x == y) && ergebnis % 10 != 2 && ergebnis > 1) System.out.println("VORSICHT! Das Ergebnis ist ungenau.");

            for (int i = 5; i >= 1; i--){
                System.out.println("Das Programm startet neu in: " + i);
                Thread.sleep(1000);
            }

            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("Das vorherige Ergebnis war: " + ergebnis);
            Main.main(lul);
        } catch (ArithmeticException e) {
            System.out.println("Division durch Null ist nicht erlaubt!");
            System.out.println();
            dividiere();
        }
    }
}
