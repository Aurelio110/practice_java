package aufgaben.aufgabe1;

import aufgaben.aufgabe1.grundrechenoperationen.*;

import java.util.Scanner;

public class Entscheidung {
    public static void entscheidung() throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        char entscheidung;
        do {
            System.out.println();
            System.out.println("Bitte entscheiden Sie sich für eine Grundrechenoperation.\n");
            System.out.println("Geben Sie für Addition ein 'a' ein.");
            System.out.println("Geben Sie für Subtraktion ein 's' ein.");
            System.out.println("Geben Sie für Multiplikation ein 'm' ein.");
            System.out.println("Geben Sie für Division ein 'd' ein.\n");
            System.out.println("Um das programm zu beenden, geben Sie bitte '0' ein!");
            System.out.println();
            System.out.print("Wofür haben Sie sich entschieden? ");
            entscheidung = scanner.next().charAt(0);

            switch (Character.toLowerCase(entscheidung)) {
                case 'a':
                    Addition.addiere();
                    break;

                case 's':

                    Subtraktion.subtrahiere();
                    break;

                case 'm':

                    Multiplikation.multipliziere();
                    break;

                case 'd':
                    Division.dividiere();
                    break;

                case '0':
                    System.exit(entscheidung);

                default:
                    System.out.println("\nSie haben keine gültige Eingabe getätigt.\nBitte versuchen Sie es nochmal!");
            }
            for (int i = 0; i < 50; ++i) System.out.println();
        } while (entscheidung != 'a' && entscheidung != 's' && entscheidung != 'm' && entscheidung != 'd');
    }
}
