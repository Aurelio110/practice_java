package weitereBeispiele.myStrategy.src;

public class Hund {
    String name;
    String rasse;
    Laufverhalten lvh = new SchnellesLaufen();
    public Hund(String name, String rasse) {
        this.name = name;
        this.rasse = rasse;
    }

    void setLaufverhalten(Laufverhalten lvh){
        this.lvh = lvh;
    }
    void laufen(){
       lvh.laufen();
    }
}
