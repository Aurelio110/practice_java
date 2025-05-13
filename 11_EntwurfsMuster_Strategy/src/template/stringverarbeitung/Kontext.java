package template.stringverarbeitung;

// Die Kontext-Klasse verwendet das bei seiner Instanziierung übergebene Strategie-Objekt und kann dies zur Laufzeit wechseln.
// Die Kontext-Klasse kommuniziert mit den Strategie-Klassen nur über das Interface. Sie weiß nichts über die implementierenden Strategien oder wie diese ausgeführt werden.
public class Kontext
{
	private Strategie strategie;

	public Kontext(Strategie strategie)
	{
		this.strategie = strategie;
	}

	public Strategie getStrategie()
	{
		return strategie;
	}

	public void setStrategie(Strategie strategie)
	{
		this.strategie = strategie;
	}

	// Diese Methode wird ausgeführt, um die Strategie auszuführen. Die konkrete Strategie ist dabei nicht bekannt. Dadurch sind Kontext und konkrete Strategie unabhängig voneinander und damit austauschbar.
	public String führeStrategieAus(String s1, String s2)
	{
		return strategie.erstelleZeichenkette(s1, s2);
	}
}
