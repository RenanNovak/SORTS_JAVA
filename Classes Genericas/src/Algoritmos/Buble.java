package Algoritmos;

import java.util.ArrayList;

public final class Buble<T extends Comparable<T>> {
	public ArrayList<T> bubleSort(ArrayList<T> list){
		double inicio = System.currentTimeMillis();
		
		for (int i = list.size(); i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (list.get(j-1).compareTo(list.get(j))>0) {
                    T aux = list.get(j);
                    list.set(j, list.get(j));
                    list.set(j-1, aux);
                }
            }
        }
		
		double fim = System.currentTimeMillis();
		double CalculodoCap = fim - inicio;
		System.out.println("Tempo em MiliSegundos "+CalculodoCap+" ms");
		return list;
	}

}