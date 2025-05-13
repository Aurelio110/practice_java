package weitereBeispiele.rpg_waffenwahl.waffen;

public class Zauberstab extends Waffe{

    public Zauberstab(String name, int schadenMin, int schadenMax) {
        super(name, schadenMin, schadenMax);
    }

    @Override
    public void angreifen() {
        System.out.println("Ich besitze den "+super.getName()+" und greife mit meinen Zaubern an.");
    }
}
