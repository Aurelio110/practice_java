package aufgaben.aufgabe1.grundrechenoperationen;
import aufgaben.aufgabe1.Entscheidung;
import aufgaben.aufgabe1.Main;

import java.math.BigDecimal;
import java.util.Scanner;

public class Subtraktion{

    public static void subtrahiere() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nBitte geben Sie eine Zahl ein: ");
        String ersteZahlString = scanner.nextLine().replace(",", ".");
        BigDecimal ersteZahl = BigDecimal.valueOf(Double.parseDouble(ersteZahlString));

        System.out.print("Bitte geben Sie eine zweite Zahl ein: ");
        String zweiteZahlString = scanner.nextLine().replace(",", ".");
        BigDecimal zweiteZahl = BigDecimal.valueOf(Double.parseDouble(zweiteZahlString));

        String ergebnis = ersteZahl.subtract(zweiteZahl).toString().replace(".", ",");


        System.out.println("Das Ergebnis ist: " + ergebnis);

        for (int i = 5; i >= 1; i--){
            System.out.println("Das Programm startet neu in: " + i);
            Thread.sleep(1000);
        }

        for (int i = 0; i < 50; ++i) System.out.println();
        System.out.println("Das vorherige Ergebnis war: " + ergebnis);
        Entscheidung.entscheidung();

    }
}