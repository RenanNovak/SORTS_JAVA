package Algoritmos;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public final class SelectionSort<T extends Comparable<T>> {
	public String selectionSort(ArrayList<T> list) {
		String acabou;
		acabou = "Fim do processamento do SELECTION";
		int i, j;
		T temp;
		double inicio, fim;
		Tempo tp = new Tempo();
		inicio = tp.getInicio();
		
		for (i = 0; i < list.size() - 1; i++) {
			for (j = i; j < list.size(); j++) {
				if (list.get(i).compareTo(list.get(j)) > 0) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}

		fim = tp.getFim();
		ArrayList<String> l = new ArrayList();
		l.add("Millisegundos: "+tp.mostrarTempo(inicio, fim));
		l.add("Segundos: "+tp.mostrarTempo(inicio, fim)/1000);
		l.add("Minutos: "+tp.mostrarTempo(inicio, fim)/(1000*60));
				try {
			Files.write(Paths.get("SELECTION"), l, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return acabou;
	}

}