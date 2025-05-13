package weitereBeispiele.personen.aktionen;

import weitereBeispiele.personen.Person;
import weitereBeispiele.personen.Personenverwaltung;

public class PersonSpeichern implements Aktion{
    @Override
    public void fuehreAktionAus(Personenverwaltung pv, Person p) {
        pv.getPersonenList().add(p);
    }
}
