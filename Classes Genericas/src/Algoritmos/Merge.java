package Algoritmos;

import java.util.ArrayList;

public class Merge <T extends Comparable<T>>{
	
	public ArrayList<T> mergesort(ArrayList<T> list){
		double inicio = System.currentTimeMillis();
		if (list.size() <= 1) {
			return list;
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
        
        double fim = System.currentTimeMillis();
		double CalculodoCap = fim - inicio;
		System.out.println("Tempo em MiliSegundos "+CalculodoCap+" ms");
		
		return merge(mergesort(left), mergesort(right));
	}
}

	private ArrayList<T> merge(ArrayList<T> left, ArrayList<T> right) {
		
		ArrayList<T> ret = new ArrayList<T>();
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

		return ret;
	}
}
