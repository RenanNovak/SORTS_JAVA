package Algoritmos;

import java.util.ArrayList;

public class Insert<T extends Comparable<T>> {
	public ArrayList<T> insertSort(ArrayList<T> list){
		
		double inicio = System.currentTimeMillis();
		
		for (int i = 0; i < list.size(); i++) {
			T aux = list.get(i);
			int j = i - 1;
			while((j >= 0) && (list.get(j).compareTo(aux) >= 0)) {
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, aux);
		}
		
		double fim = System.currentTimeMillis();
		double CalculodoCap = fim - inicio;
		System.out.println("Tempo em MiliSegundos "+CalculodoCap+" ms");
		return list;
	}

}
