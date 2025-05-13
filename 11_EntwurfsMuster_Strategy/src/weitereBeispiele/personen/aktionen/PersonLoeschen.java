package weitereBeispiele.personen.aktionen;

import weitereBeispiele.personen.Person;
import weitereBeispiele.personen.Personenverwaltung;

public class PersonLoeschen implements Aktion{
    @Override
    public void fuehreAktionAus(Personenverwaltung pv, Person p) {
        pv.getPersonenList().remove(p);
    }
}
