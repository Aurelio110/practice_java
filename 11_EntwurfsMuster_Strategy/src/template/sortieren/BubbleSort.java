package template.sortieren;

// Der Bubblesort ist der einfachste, aber auch einer der langsamsten Sortieralgorithmen.
// Bubblesort vergleicht alle benachbarten Elemente in einer Liste und tauscht diese in die richtige Reihenfolge.
// Konkrete Strategie
public class BubbleSort implements Sortieralgorithmus
{
	@Override
	public void sortiere(int[] list)
	{
		boolean run = true;
		int temp;

		for (int i = 0; i < list.length && run; i++)
		{
			run = false;

			for (int j = 0; j < list.length - 1 - i; j++)
			{
				if (list[j] > list[j+1])
				{
					temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;

					run = true;
				}
			}
		}
	}
}
