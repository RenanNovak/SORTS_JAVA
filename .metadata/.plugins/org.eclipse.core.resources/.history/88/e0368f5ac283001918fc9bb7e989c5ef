package Algoritmos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Quick <T extends Comparable<T>>{
	
	public String quicksort(ArrayList<T>vet,int ini,int fim){
		String acabou;
		acabou = "Fim do processamento do QUICK";
		double inicio, fimT;
		Tempo tp = new Tempo();
		inicio = tp.getInicio();
		
		
		int meio;
		if(ini<fim) {
			meio = partition(vet, ini, fim);
			quicksort(vet, ini, meio);
			quicksort(vet, meio + 1, fim);
		}
		
		fimT = tp.getFim();
		
		ArrayList<String> l = new ArrayList();
		l.add("Millisegundos: "+tp.mostrarTempo(inicio, fim));
		l.add("Segundos: "+tp.mostrarTempo(inicio, fim)/1000);
		l.add("Minutos: "+tp.mostrarTempo(inicio, fim)/(1000*60));
				try {
			Files.write(Paths.get("QUICK"), l, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return acabou;
	
	}
	
	public int partition(ArrayList<T>vet,int ini,int fim){
		
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
