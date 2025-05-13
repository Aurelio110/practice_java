package aufgaben.lösung_2v2;

public interface StornoAlgorithmus
{
    public abstract double berechneStorno(Reise reise);
}

class KulanterStornoAlgorithmus implements StornoAlgorithmus
{
    // Die Stornierung mit dem kulanten Algorithmus kostet 25% der Reisekosten, wenn es noch mehr als ein Tag bis zur Reise sind, sonst 50%.
    @Override
    public double berechneStorno(Reise reise)
    {
        if (reise.bestimmeTage() >= 1)
            return reise.berechnePreis() * 0.25;
        return reise.berechnePreis() * 0.50;
    }
}

class StrengerStornoAlgorithmus implements StornoAlgorithmus
{
    // Eine Stornierung der Reise mit dem strengen Algorithmus kostet 25% der Reisekosten, wenn die Tage bis zur Abreise > 10 sind, sonst 75%.
    @Override
    public double berechneStorno(Reise reise)
    {
        if (reise.bestimmeTage() > 10)
            return reise.berechnePreis() * 0.25;
        return reise.berechnePreis() * 0.75;
    }
}