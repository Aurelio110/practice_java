package weitereBeispiele.personen.aktionen;

import weitereBeispiele.personen.Person;
import weitereBeispiele.personen.Personenverwaltung;

public interface Aktion {
    public abstract void fuehreAktionAus(Personenverwaltung pv, Person p);
}


