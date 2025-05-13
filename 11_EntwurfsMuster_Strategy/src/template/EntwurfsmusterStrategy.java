package template;

// Das Strategy-Muster.
// Allgemeines: Ist ein Verhaltensmuster, welches uns erlaubt eine Familie von Algorithmen zu definieren, jeden Algorithmus in eine getrennte Klasse
// zu stecken und ihre Objekte austauschbar zu machen.
// Motivation: Wir verwenden das Strategiemuster, wenn wir verschiedene Varianten (Strategien) eines Algorithmus in einem Objekt brauchen und diese zur Laufzeit austauschen möchten.
// Erklärung: Im Strategy-Muster kann das Verhalten einer Klasse oder deren Algorithmen zur Laufzeit ausgetauscht werden. Wir kreieren Objekte, die
// verschiedene Strategien repräsentieren und ein Kontextobjekt, dessen Verhalten sich nach je nach eingesetzter Strategie ändert.

// Vorteile:
// - Algorithmen, die in einem Objekt verwendet werden, können zur Laufzeit ausgetauscht werden.
// - Wir können die Implementationsdetails der Strategien isolieren von dem Code, der die Strategien ausführt.
// - Open/Closed Prinzip: Es können einfach neue Strategien hinzugefügt werden (Open: offen für Erweiterungen), ohne bestehenden Code abändern zu müssen (Closed: geschlossen für Änderungen).

// Nachteile:
// - Hat das Programm nur wenige Algorithmen, die sich selten ändern, gibt es keinen ausreichenden Grund das Programm mit neuen Klassen und Interfaces zu verkomplizieren.
// - Der Client muss um die Unterschiede der Algorithmen wissen, um den angemessenen auszuwählen.
// - Einige moderne Programmiersprachen unterstützen funktionale Programmierung und können dieselbe Funktionalität, ohne zusätzliche Klassen und Interfaces, einfacher umsetzen.

// Implementierungsschritte Strategy-Muster
// 1. Erstelle ein Interface mit einer abstrakten Methode. -> Strategie.java
// 2. Erstelle konkrete Klassen, die das Interface implementieren. Für jede konkrete Strategie eine Klasse.
// 3. Erstelle eine Kontextklasse. Eine Kontextklasse muss ein Attribut bereithalten um eine Referenz zu einer Strategie abspeichern zu können.
// Die Kontextklasse funktioniert mit allen Strategien durch dasselbe Interface, welches nur eine Methode bereitstellt, um die gewählte Strategie auszuführen.
// Durch das Strategy Pattern wird die Kontextklasse unabhängig von konkreten Strategien und der Entwickler kann beliebig neue Algorithmen / Strategien hinzufügen oder bestehende ändern, ohne die Kontextklasse oder bestehende Strategie-Klassen anpassen zu müssen.

//https://refactoring.guru/design-patterns


import template.sortieren.BubbleSort;
import template.sortieren.MergeSort;
import template.sortieren.QuickSort;
import template.sortieren.Sortierer;
import template.stringverarbeitung.*;

import java.util.Arrays;
import java.util.Random;


public class EntwurfsmusterStrategy
{
	private static final Random random = new Random();

	public static void main(String[] args)
	{
		//<editor-fold desc="Stringverarbeitung Beispiel">
		String string1 = "Hallo, ";
		String string2 = "Welt!";

		// Ich erzeuge ein Objekt vom Typ 'StrategieNormal' und weise dies einer Variable vom Typ 'Strategie' zu. Da die Klasse 'StrategieNormal' das Interface 'Strategie' implementiert, ist eine solche Zuweisung möglich.
		Strategie normal = new StrategieNormal();
		// Das Objekt von 'StrategieNormal' wird dann dem Konstruktor 'Kontext' übergeben.
		Kontext kontext = new Kontext(normal);
		System.out.println("Normal: " + kontext.führeStrategieAus(string1, string2));

		// Zum Austausch der Strategie rufen wir die setStrategie()-Methode auf, oder instanziieren ein neues Kontext-Objekt.
		kontext.setStrategie(new StrategieKleinschreibung());
		System.out.println("Klein: " + kontext.führeStrategieAus(string1, string2));

		kontext.setStrategie(new StrategieGroßschreibung());
		System.out.println("Groß: " + kontext.führeStrategieAus(string1, string2));
		//</editor-fold>

		//<editor-fold desc="Sortieralgorithmus Beispiel">
		int[] zahlen = new int[10];
		fülleArray(zahlen);

		// Kontext erstellen und BubbleSort zuweisen:
		Sortierer sortierer = new Sortierer(new BubbleSort());
		sortierer.sortiere(zahlen);
		System.out.println("Bubblesort:");
		System.out.println(Arrays.toString(zahlen));

		// Strategie zu QuickSort ändern:
		sortierer.setAlgorithmus(new QuickSort());

		fülleArray(zahlen);
		sortierer.sortiere(zahlen);
		System.out.println("Quicksort:");
		System.out.println(Arrays.toString(zahlen));

		// Strategie zu MergeSort ändern:
		sortierer = new Sortierer(new MergeSort());
		fülleArray(zahlen);
		sortierer.sortiere(zahlen);
		System.out.println("Mergesort:");
		System.out.println(Arrays.toString(zahlen));
		//</editor-fold>
	}

	private static void fülleArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
			arr[i] = random.nextInt(100);
	}
}
