package weitereBeispiele.rpg_waffenwahl;

import weitereBeispiele.rpg_waffenwahl.charaktere.Ritter;
import weitereBeispiele.rpg_waffenwahl.charaktere.Magier;
import weitereBeispiele.rpg_waffenwahl.waffen.Schwert;
import weitereBeispiele.rpg_waffenwahl.waffen.Waffe;
import weitereBeispiele.rpg_waffenwahl.waffen.Zauberstab;

public class Main {
    public static void main(String[] args) {

        //region Ritter Heinrich


        Ritter heinrich = new Ritter("Heinrich","Mensch", new Schwert("Flammenschwert",235,295));
        heinrich.angreifen();
        System.out.println(" ");
        System.out.println(heinrich.getWaffe());
        System.out.println(" ");

        //endregion

        //region Magier Merlin


        Magier merlin = new Magier("Merlin", "Mensch", new Zauberstab("Stab der Reinheit",450,496));
        merlin.angreifen();
        System.out.println(" ");
        System.out.println(merlin.getWaffe());


        //endregion

        //region Waffenliste


        System.out.println("\nAusgabe der aktuellen Waffenliste:");
        for(Waffe w : Waffe.waffenListe){
            System.out.println(w+"\n");
        }


        //endregion
    }
}
