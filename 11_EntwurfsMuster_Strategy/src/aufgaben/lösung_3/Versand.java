package aufgaben.lösung_3;

public interface Versand
{
    double berechnen(Warenkorb warenkorb);
}

class Standard implements Versand
{
    public double berechnen(Warenkorb warenkorb)
    {
        double summe = warenkorb.getGesamtwert();
        if (summe < 100)
            return 10;
        return 5;
    }
}

class Express implements Versand
{
    public double berechnen(Warenkorb warenkorb)
    {
        double summe = warenkorb.getGesamtwert();
        if (summe < 100)
            return 15;
        return 10;
    }
}