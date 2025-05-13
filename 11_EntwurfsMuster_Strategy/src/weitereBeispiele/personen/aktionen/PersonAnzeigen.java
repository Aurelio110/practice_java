package weitereBeispiele.personen.aktionen;

import weitereBeispiele.personen.Person;
import weitereBeispiele.personen.Personenverwaltung;

public class PersonAnzeigen implements Aktion{

    @Override
    public void fuehreAktionAus(Personenverwaltung pv, Person p) {
        for(Person person : pv.getPersonenList()){
            if(person.equals(p)){
                System.out.println(person);
            }
        }
    }
}
