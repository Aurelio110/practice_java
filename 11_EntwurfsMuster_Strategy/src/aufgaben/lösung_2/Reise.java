package aufgaben.lösung_2;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class Reise
{
    protected double grundPreis;
    private final LocalDateTime reiseBeginn;
    protected StornoAlgorithmus stornoAlgorithmus;

    public Reise(LocalDateTime reiseBeginn, double grundPreis)
    {
        this.reiseBeginn = reiseBeginn;
        this.grundPreis = grundPreis;
    }

    /**
     * Ermittelt die Anzahl Tage bis zum Reisebeginn.
     */
    public int bestimmeTage()
    {
        return (int)Duration.between(LocalDateTime.now(), reiseBeginn).toDays();
    }

    /**
     * Kalkuliert mit unterschiedlichen Algorithmen den Preis der Reise.
     */
    public abstract double berechnePreis();

    /**
     * Setzt den Storno Algorithmus.
     */
    public void setStornoAlgorithmus(StornoAlgorithmus stornoAlgorithmus)
    {
        this.stornoAlgorithmus = stornoAlgorithmus;
    }

    /**
     * Berechnet die Stornogebühren und gibt diese zurück.
     */
    public double berechneStorno()
    {
        return stornoAlgorithmus.berechneStorno(this);
    }

}

class GoldReise extends Reise
{
    // Bei GoldReisen kommt der kulante Stornoalgorithmus zum Einsatz
    public GoldReise(LocalDateTime reiseBeginn, double grundPreis)
    {
        super(reiseBeginn, grundPreis);
        this.stornoAlgorithmus = new KulanterStornoAlgorithmus();
    }

    @Override
    public double berechnePreis()
    {
        return grundPreis * 1.75;
    }
}

class BronzeReise extends Reise
{
    // Bei BronzeReisen kommt der strenge Stornoalgorithmus zum Einsatz (bei Stammkunden kann der Algorithmus auf den kulanten Stornoalgorithmus gesetzt werden)
    public BronzeReise(LocalDateTime reiseBeginn, double grundPreis)
    {
        super(reiseBeginn, grundPreis);
        this.stornoAlgorithmus = new StrengerStornoAlgorithmus();
    }

    @Override
    public double berechnePreis()
    {
        return grundPreis * 1.25;
    }
}

