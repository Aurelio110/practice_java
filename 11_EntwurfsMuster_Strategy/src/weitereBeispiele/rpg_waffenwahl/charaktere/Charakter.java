package weitereBeispiele.rpg_waffenwahl.charaktere;


import weitereBeispiele.rpg_waffenwahl.waffen.Waffe;

public abstract class Charakter {
    private String name;
    private String klasse;
    private String volk;
    private Waffe waffe;

    protected Charakter(String name, String volk, Waffe waffe) {
        this.name = name;
        this.volk = volk;
        this.waffe = waffe;
        this.klasse = this.getClass().getSimpleName();
    }

    public Waffe getWaffe(){
        return waffe;
    }

    public void setWaffe(Waffe waffe){
        this.waffe = waffe;
    }

    public String getName() {
        return name;
    }

    public String getKlasse() {
        return klasse;
    }

    public String getVolk() {
        return volk;
    }

    public void angreifen(){
        waffe.angreifen();
    }

    @Override
    public String toString(){
        return "Name: "+name+" Klasse: "+klasse+" Volk: "+volk+ " Aktuelle Waffe: "+ waffe.getClass().getSimpleName();
    }
}
