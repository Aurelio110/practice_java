package aufgaben.lösung_2;


public interface StornoAlgorithmus
{
    double berechneStorno(Reise reise);
}

class StrengerStornoAlgorithmus implements StornoAlgorithmus
{
    public double berechneStorno(Reise reise)
    {
        return reise.bestimmeTage() > 10 ? reise.berechnePreis() * 0.25 : reise.berechnePreis() * 0.75;
    }
}

class KulanterStornoAlgorithmus implements StornoAlgorithmus
{
    public double berechneStorno(Reise reise)
    {
        return reise.bestimmeTage() > 1 ? reise.berechnePreis() * 0.25 : reise.berechnePreis() * 0.5;
    }
}