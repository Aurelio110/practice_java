package template.sortieren;

//  Quicksort gehört zu den rekursiven Sortieralgorithmen und verwendet das "Teile und Herrsche" Prinzip (Divide and Conquer).
//  Wir wählen ein beliebiges Element aus einer Liste von Zahlen und bezeichnen diese Zahl als Pivotelement.
//  Wir verwenden das Pivotelement, um die Liste in zwei Unterlisten aufzuteilen.
//  Dann ordnen wir alle Zahlen so an, dass die niedrigeren Zahlen vor dem Pivotelement gesetzt werden und die höheren nach dem Pivotelement.
//  Das Pivotelement befindet sich nun an der richtigen Stelle. Wir wenden diese Schritte rekursiv auf beide Unterlisten an.
// Konkrete Strategie
public class QuickSort implements Sortieralgorithmus
{
    @Override
    public void sortiere(int[] zahlen)
    {
        if (zahlen == null || zahlen.length == 0)
        {
            return;
        }

        int laenge = zahlen.length;
        quicksort(zahlen, 0, laenge - 1);
    }

    private void quicksort(int[] zahlen, int niedrig, int hoch)
    {
        int i = niedrig, j = hoch;

        // Wir holen uns das Pivot Element aus der Mitte der Liste:
        int pivot = zahlen[niedrig + (hoch - niedrig) / 2];

        // Wir teilen die Liste in zwei Listen auf:
        while (i <= j)
        {
            // Ist das linke Element niedriger als das Pivotelement, dann prüfen wir das naechste Element in der linken Liste.
            while (zahlen[i] < pivot)
            {
                i++;
            }

            // Ist das rechte Element größer als das Pivotelement, dann prüfen wir das naechste Element in der rechten Liste.
            while (zahlen[j] > pivot)
            {
                j--;
            }

            // Haben wir Zahlen in beiden Listen gefunden, die nicht richtig sortiert sind, dann tauschen wir diese.
            if (i <= j)
            {
                int temp = zahlen[i];
                zahlen[i] = zahlen[j];
                zahlen[j] = temp;
                i++;
                j--;
            }
        }

        // Rekursiver Aufruf:
        if (niedrig < j)
        {
            quicksort(zahlen, niedrig, j);
        }

        if (i < hoch)
        {
            quicksort(zahlen, i, hoch);
        }
    }

}
