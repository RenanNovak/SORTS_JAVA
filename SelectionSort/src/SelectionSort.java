import java.util.ArrayList;

public class SelectionSort<T extends Comparable<T>> {
	public ArrayList<T> selectionSort (ArrayList<T> list) {
		int i, j, minIndex;
		T temp;
		T minValue;
		
		for (i = 0; i < list.size()-1; i++) {
			minValue = list.get(i);
			minIndex = i;
			for (j = i; j < list.size(); j++) {
				//if (list.get(j) < (intminValue) {
				try {
					if(list.get(j).compareTo(minValue) < 0) {
						minValue = list.get(j);
						minIndex = j;
					}
				}catch(Exception e) {
					e.getCause();
				}
				//if (minValue < list.get(i)) {
				if (list.get(i).compareTo(list.get(j)) < 0) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
			
		}
		
		return list;
	}

}
