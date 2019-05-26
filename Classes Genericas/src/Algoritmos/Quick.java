package Algoritmos;

import java.util.ArrayList;

public class Quick <T extends Comparable<T>>{
	
	public ArrayList<T> quicksort(ArrayList<T>vet,int ini,int fim){
		double inicio = System.currentTimeMillis();
		int meio;
		if(ini<fim) {
			meio = partition(vet, ini, fim);
			quicksort(vet, ini, meio);
			quicksort(vet, meio + 1, fim);
		}
		
		double fim1 = System.currentTimeMillis();
		double CalculodoCap = fim1 - inicio;
		System.out.println("Tempo em MiliSegundos "+CalculodoCap+" ms");
		
		return vet;
	}
	
	public int partition(ArrayList<T>vet,int ini,int fim){
		
		//T pivo, topo, i;
		
		T pivo = vet.get((int) ini);
		int topo = ini;
		
		for(int i = ini + 1; i<=fim;i++) {
			if(vet.get(i).compareTo(pivo)<0) {
				vet.set(topo, vet.get(i));
				vet.set(i, vet.get(topo+1));
				topo++;
			}
		}
		vet.set(topo, pivo);
		return topo;
	}
}
