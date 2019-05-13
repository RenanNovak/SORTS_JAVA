import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static ArrayList<Integer> selectionSort (ArrayList<Integer> list) {
		int i, j, minValue, minIndex, temp = 0;
		for (i = 0; i < list.size(); i++) {
			minValue = list.get(i);
			minIndex = i;
			for (j = i; j < list.size(); j++) {
				if (list.get(j) < minValue) {
					minValue = list.get(j);
					minIndex = j;
				}
			}
			if (minValue < list.get(i)) {
				temp = list.get(i);
				list.set(i, list.get(minIndex));
				list.set(minIndex, temp);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<>();
		Random random = new Random();
		
		
		selectionSort(lista);
		
		for(int i = 0; i<5;i++) {
			int numero = random. nextInt(100);
			lista.add(numero);
			System.out.println(lista);
			
		}
		System.out.println(selectionSort(lista));
		//System.out.println(lista);
		for(int i = 0; i<5;i++) {
			//System.out.println(selectionSort(lista));
		}
	}
}
