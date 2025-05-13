package weitereBeispiele.personen;

import weitereBeispiele.personen.aktionen.Aktion;

import java.util.ArrayList;
import java.util.List;

public class Personenverwaltung {
    private List<Person> personenList = new ArrayList<>();

    private Aktion aktion;

    public Personenverwaltung(Aktion aktion){
        this.aktion = aktion;

    }

    public List<Person> getPersonenList(){
        return personenList;
    }

    public Aktion getAktion(){
        return aktion;
    }

    public void setAktion(Aktion aktion){
        this.aktion = aktion;
    }

    public void fuehreAktionAus(Person person){
        aktion.fuehreAktionAus(this,person);
    }

    public void anzeigenPersonenListe(){

        if(personenList.isEmpty())
            System.out.println("\nKeine Einträge in der Personenliste");
        else{
            System.out.println("\nAnzeige der PersonenListe: ");
            for(Person p : personenList){
                System.out.println(p);
            }
        }
    }
}
