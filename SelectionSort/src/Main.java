import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	public static ArrayList<String> Leitura;
	
	public static ArrayList<String> selectionSort (ArrayList<String> list) {
		int i, j, minIndex;
		String temp;
		String minValue;
		
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

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();		
		
		ArrayList<Float>Leit = new ArrayList<>();
		//selectionSort(lista);
		//selectionSort(Leit);
		System.out.println("*****************************************************");
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe o nome de arquivo texto:\n");
		String nome = sc.nextLine();
	    String Path = "C:/Users/Miguel/Desktop/";
	    int aux = 0;
		
		try {
		FileReader arq = new FileReader(Path+nome+".txt");
		BufferedReader lerArq = new BufferedReader(arq);
		
		
		String linha = lerArq.readLine();
		while (linha != null) {
			System.out.println(aux);
	        System.out.printf("  %s\n", linha);
	        linha = lerArq.readLine(); // lê da segunda até a última linha
			if(linha != null)
				Leit.add(Float.parseFloat(linha)); //= Integer.parseInt(linha);
			aux++;
	      }
		
		arq.close();
		
		}catch(IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
			
		}
		System.out.println("*****************************************************");
		long inicio = System.currentTimeMillis();
		//selectionSort(Leit);
		Bolha<Float> b = new Bolha<Float>();
		System.out.println(b.selectionSort(Leit));
		long fim = System.currentTimeMillis();
		
		double CalculodoCap = fim - inicio;
		System.out.println(CalculodoCap);
		
		//System.out.println(selectionSort(Leit));
		//System.out.println(selectionSort(linha));
		//System.out.println(lista);
		//for(int i = 0; i<5;i++) {
			//System.out.println(selectionSort(lista));
		//}
	}
}