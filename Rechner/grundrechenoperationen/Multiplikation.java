package aufgaben.aufgabe1.grundrechenoperationen;
import aufgaben.aufgabe1.Main;

import java.util.Scanner;

public class Multiplikation {
    public static void multipliziere() throws InterruptedException {
        String[] lul = new String[0];
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nBitte geben Sie eine Zahl ein: ");
        double x = scanner.nextDouble();

        System.out.print("Bitte geben Sie eine zweite Zahl ein: ");
        double y = scanner.nextDouble();

        double ergebnis = x*y;
        System.out.println("Das Ergebnis ist: " + ergebnis);

        for (int i = 5; i >= 1; i--){
            System.out.println("Das Programm startet neu in: " + i);
            Thread.sleep(1000);
        }

        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("Das vorherige Ergebnis war: " + ergebnis);
        Main.main(lul);
    }
}