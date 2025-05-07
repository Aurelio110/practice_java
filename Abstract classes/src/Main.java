import Gelaende.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Gelaende[] gelaende = {new Wasser(), new Strasse(), new Feldweg(), new Schlucht(), new Berg()};

        for (int i = 0; i < 10; i++) {
            Gelaende terrain = gelaende[random.nextInt(gelaende.length)];

            System.out.println("****************************");
            System.out.println();
            System.out.println("Runde " + (i + 1) + ": \nGelände lautet: " + terrain.getClass().getSimpleName());
            System.out.println(terrain.getAction());
            System.out.println();
        }
    }
}
