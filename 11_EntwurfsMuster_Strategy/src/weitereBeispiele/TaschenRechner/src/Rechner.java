package weitereBeispiele.TaschenRechner.src;

public class Rechner {
    Berechnung algo = new ReAddition();

    int berechne(int a, int b){

        return algo.berechne(a, b);
    }

    void setAlgo(Berechnung algo){
        this.algo= algo;
    }
}
