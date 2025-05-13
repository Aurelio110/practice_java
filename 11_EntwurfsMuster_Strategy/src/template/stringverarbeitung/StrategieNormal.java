package template.stringverarbeitung;

// Diese konkrete Strategie-Klasse implementiert das Strategie-Interface und implementiert damit das konkrete verhalten, also die konkrete Strategie.
public class StrategieNormal implements Strategie
{
	@Override
	public String erstelleZeichenkette(String s1, String s2)
	{
		return s1 + s2;
	}
}
