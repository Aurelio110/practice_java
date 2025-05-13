package weitereBeispiele.TaschenRechner.src;

public class RePotenz implements Berechnung{
    @Override
    public int berechne(int a, int b) {
        return (int) (Math.pow(a, b));
    }
}
