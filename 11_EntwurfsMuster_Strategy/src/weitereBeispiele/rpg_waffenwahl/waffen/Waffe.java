package weitereBeispiele.rpg_waffenwahl.waffen;

import java.util.ArrayList;
import java.util.List;

public abstract class Waffe {

    public static final List<Waffe> waffenListe = new ArrayList<>();
    private static int zaehler = 1;
    private final int id;
    private String name;
    private String klasse;
    private int schadenMin;
    private int schadenMax;

    protected Waffe(String name, int schadenMin, int schadenMax) {
        this.id = zaehler;
        zaehler++;
        this.name = name;
        this.klasse = this.getClass().getSimpleName();
        this.schadenMin = schadenMin;
        this.schadenMax = schadenMax;
        waffenListe.add(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKlasse() {
        return klasse;
    }


    public int getSchadeMin() {
        return schadenMin;
    }

    public void setSchadeMin(int schadeMin) {
        this.schadenMin = schadeMin;
    }

    public int getSchadenMax() {
        return schadenMax;
    }

    public void setSchadenMax(int schadenMax) {
        this.schadenMax = schadenMax;
    }

    public abstract void angreifen();

    @Override
    public String toString(){
        return "*****************************\nWaffeninfo:\nName:\t\t"+name+"\nKlasse:\t\t"+klasse+"\nSchaden:\t"+
                schadenMin+" - "+schadenMax+"\n****************************";
    }

}
