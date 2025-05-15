package aufgaben.aufgabe1.grundrechenoperationen;
import aufgaben.aufgabe1.Main;

import java.util.Scanner;

public class Subtraktion{

    public static void subtrahiere() throws InterruptedException {
        String[] lul = new String[0];
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nBitte geben Sie eine Zahl ein: ");
        double x = scanner.nextDouble();

        System.out.print("Bitte geben Sie eine zweite Zahl ein: ");
        double y = scanner.nextDouble();

        double ergebnisNach = (x%1 -y%1);
        double ergebnisVor = ((int)x-(int)y);

        System.out.println("Das Ergebnis ist: " + ergebnisVor + "," + ergebnisNach);

        for (int i = 5; i >= 1; i--){
            System.out.println("Das Programm startet neu in: " + i);
            Thread.sleep(1000);
        }

        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("Das vorherige Ergebnis war: " + ergebnisVor + "," + ergebnisNach);
        Main.main(lul);
    }
}