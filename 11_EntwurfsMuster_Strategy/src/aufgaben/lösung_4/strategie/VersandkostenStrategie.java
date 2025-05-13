package aufgaben.lösung_4.strategie;

public interface VersandkostenStrategie
{
    public double berechneVersandkosten();
}

class DHL implements VersandkostenStrategie
{

    @Override
    public double berechneVersandkosten()
    {
        return 4.00d;
    }
}

class Hermes implements VersandkostenStrategie
{

    @Override
    public double berechneVersandkosten()
    {
        return 2.95d;
    }
}

class UPS implements VersandkostenStrategie
{

    @Override
    public double berechneVersandkosten()
    {
        return 3.50d;
    }
}
