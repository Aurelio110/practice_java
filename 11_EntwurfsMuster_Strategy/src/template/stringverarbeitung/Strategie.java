package template.stringverarbeitung;

// 1. Einfaches Beispiel mit Stringverarbeitung:

// Das Strategie-Interface ist allen konkreten Strategien bekannt. Es deklariert eine Methode, die von der Kontextklasse verwendet wird, um die Strategie auszuführen.
// Abstrakte Strategie
public interface Strategie
{
	public abstract String erstelleZeichenkette(String s1, String s2);
}
