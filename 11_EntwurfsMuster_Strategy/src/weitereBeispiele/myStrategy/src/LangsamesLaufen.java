package weitereBeispiele.myStrategy.src;

public class LangsamesLaufen implements Laufverhalten{
    @Override
    public void laufen() {
        System.out.println("Der Hund schleicht durchs Bild");
    }
}
