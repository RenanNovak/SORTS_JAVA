package Algoritmos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class Merge <T extends Comparable<T>>{
	
	public String mergesort(ArrayList<T> list){
		String acabou;
		acabou = "Fim do processamento do MERGE";
		
		double inicio, fim;
		Tempo tp = new Tempo();
		inicio = tp.getInicio();
		
		if (list.size() <= 1) {
			return acabou;
		}else {
		
		int meio = list.size() / 2;
        ArrayList<T> right = new ArrayList<T>();
        ArrayList<T> left = new ArrayList<T>();
        
        for(int i=0;i<meio;i++) { 
			left.add(list.get(i));
        }
        for(int i=meio;i<list.size();i++) { 
        	right.add(list.get(i));
        }
        
        fim = tp.getFim();
        ArrayList<String> M = new ArrayList();
		M.add("Millisegundos: "+tp.mostrarTempo(inicio, fim));
		M.add("Segundos: "+tp.mostrarTempo(inicio, fim)/1000);
		M.add("Minutos: "+tp.mostrarTempo(inicio, fim)/(1000*60));
				try {
			Files.write(Paths.get("MERGE"), M, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return acabou;
	}
}

	private String merge(ArrayList<T> left, ArrayList<T> right) {
		
		ArrayList<T> ret = new ArrayList<T>();
		String acabou;
		acabou = "Fim do processamento do BUBBLE";
		int a_idx = 0, b_idx = 0;
		
		while(a_idx+1 <= left.size() || b_idx+1 <= right.size()) { 
			if(a_idx+1 <= left.size() && b_idx+1 <= right.size()) {
				if(left.get(a_idx).compareTo(right.get(b_idx)) <= 0.0) { 
					ret.add(left.get(a_idx));
					a_idx++;
				} else { 
					ret.add(right.get(b_idx));
					b_idx++;
				}
			} else if(a_idx+1 <= left.size()) { 
				ret.add(left.get(a_idx));
				a_idx++;
			} else if(b_idx+1 <= right.size()) { 
				ret.add(right.get(b_idx));
				b_idx++;
			}
		}

		return acabou;
	}
}
