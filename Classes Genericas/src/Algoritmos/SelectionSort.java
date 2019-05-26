package Algoritmos;
import java.util.ArrayList;

public final class SelectionSort<T extends Comparable<T>> {
	public ArrayList<T> selectionSort(ArrayList<T> list) {
		int i, j;
		T temp;
		double inicio = System.currentTimeMillis();

		for (i = 0; i < list.size() - 1; i++) {
			for (j = i; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) > 0) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		double fim = System.currentTimeMillis();
		double CalculodoCap = fim - inicio;
		System.out.println("Tempo em MiliSegundos "+CalculodoCap+" ms");
		return list;
	}

}