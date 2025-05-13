package weitereBeispiele.personen;

import weitereBeispiele.personen.aktionen.PersonAnzeigen;
import weitereBeispiele.personen.aktionen.PersonLoeschen;
import weitereBeispiele.personen.aktionen.PersonSpeichern;

public class Main {
    public static void main(String[] args) {
        Personenverwaltung pv = new Personenverwaltung(new PersonSpeichern());
        Person p1 = new Person("Anton","Haller","1976");
        Person p2 = new Person("Sabine", "Johansen","1990");

        // Ausgabe der Personenliste
        pv.anzeigenPersonenListe();

        pv.fuehreAktionAus(p1);
        pv.fuehreAktionAus(p2);

        // Ausgabe der Personenliste
        pv.anzeigenPersonenListe();

        pv.setAktion(new PersonAnzeigen());
        System.out.println("\nAusgabe einer einzelnen Person: ");
        pv.fuehreAktionAus(p1);

        pv.setAktion(new PersonLoeschen());
        pv.fuehreAktionAus(p1);

        // Ausgabe der Personenliste
        pv.anzeigenPersonenListe();
    }
}
