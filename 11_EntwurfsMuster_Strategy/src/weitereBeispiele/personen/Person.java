package weitereBeispiele.personen;

public class Person {
    private String vorname;
    private String nachname;
    private String geburtsjahr;

    public Person(String vorname, String nachname, String geburtsjahr){
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsjahr = geburtsjahr;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getGeburtsjahr() {
        return geburtsjahr;
    }

    @Override
    public String toString(){
        return "**********************\nVorname: "+vorname+"\nNachname: "+nachname+"\nGeburtsjahr: "+geburtsjahr+
                "\n**********************";
    }
}
