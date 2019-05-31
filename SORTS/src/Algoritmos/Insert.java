package Algoritmos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Insert<T extends Comparable<T>> {
	public String insertSort(ArrayList<T> list){
		String acabou;
		acabou = "Fim do processamento do INSERT";
		double inicio, fim;
		Tempo tp = new Tempo();
		inicio = tp.getInicio();
		
		for (int i = 0; i < list.size(); i++) {
			T aux = list.get(i);
			int j = i - 1;
			while((j >= 0) && (list.get(j).compareTo(aux) >= 0)) {
				list.set(j+1, list.get(j));
				j--;
			}
			list.set(j+1, aux);
		}
		
		fim = tp.getFim();
		ArrayList<String> I = new ArrayList();
		I.add("Millisegundos: "+tp.mostrarTempo(inicio, fim));
		I.add("Segundos: "+tp.mostrarTempo(inicio, fim)/1000);
		I.add("Minutos: "+tp.mostrarTempo(inicio, fim)/(1000*60));
				try {
			Files.write(Paths.get("INSERT"), I, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return acabou;
	}

}
