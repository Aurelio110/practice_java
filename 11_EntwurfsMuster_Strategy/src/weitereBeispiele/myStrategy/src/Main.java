package weitereBeispiele.myStrategy.src;

public class Main {

    public static void main(String[] args) {
        Hund angelo = new Hund("Angelo", "Pitbull");
        angelo.laufen();
        angelo.setLaufverhalten(new HummpelndesLaufen());
        angelo.laufen();
    }
}
