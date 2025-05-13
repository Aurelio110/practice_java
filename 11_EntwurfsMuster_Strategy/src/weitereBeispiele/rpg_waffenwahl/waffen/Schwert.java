package weitereBeispiele.rpg_waffenwahl.waffen;

public class Schwert extends Waffe{

    public Schwert(String name, int schadenMin, int schadenMax) {
        super(name, schadenMin, schadenMax);
    }

    @Override
    public void angreifen() {
        System.out.println("Ich besitze ein "+super.getName()+" und greife mit starken Hieben an.");
    }
}
