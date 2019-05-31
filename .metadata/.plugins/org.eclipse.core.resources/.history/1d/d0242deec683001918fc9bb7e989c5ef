package Algoritmos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public final class Bubble<T extends Comparable<T>> {
	public String bubleSort(ArrayList<T> list){
		String acabou;
		acabou = "Fim do processamento do BUBBLE";
		double inicio, fim;
		Tempo tp = new Tempo();
		inicio = tp.getInicio();
		
		for (int i = list.size(); i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (list.get(j-1).compareTo(list.get(j))>0) {
                    T aux = list.get(j);
                    list.set(j, list.get(j));
                    list.set(j-1, aux);
                }
            }
        }
		
		fim = tp.getFim();
		ArrayList<String> l = new ArrayList();
		l.add("Millisegundos: "+tp.mostrarTempo(inicio, fim));
		l.add("Segundos: "+tp.mostrarTempo(inicio, fim)/1000);
		l.add("Minutos: "+tp.mostrarTempo(inicio, fim)/(1000*60));
				try {
			Files.write(Paths.get("BUBBLE"), l, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return acabou;
	}

}