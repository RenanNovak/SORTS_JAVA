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
		
		ArrayList<Float>Leit = new ArrayList<>();
		ArrayList<String>LeitString = new ArrayList<>();
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
			if((linha != null ) && (nome.equals("numeros_100000")))
				Leit.add(Float.parseFloat(linha)); //= Integer.parseInt(linha);
			if((linha != null ) && (nome.equals("palavras_100000")))
				LeitString.add(linha); //= Integer.parseInt(linha);
			
			aux++;
	      }
		
		arq.close();
		
		}catch(IOException e) {
	        System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
		}
		sc.close();
		System.out.println("*****************************************************");
		long inicio = System.currentTimeMillis();
		
		SelectionSort<Float> b = new SelectionSort<Float>(); //SelectionSort en tipo Float.
		SelectionSort<String> bString = new SelectionSort<String>(); //SelectionSort en tipo String.
		
		
		if(nome.equals("numeros_100000"))
			System.out.println("Entrou Numeros!!");
			System.out.println(b.selectionSort(Leit));
		if(nome.equals("palavras_100000"))
			System.out.println(bString.selectionSort(LeitString));
		
		
		
		long fim = System.currentTimeMillis();
		
		double CalculodoCap = fim - inicio;
		System.out.println(CalculodoCap);
		
	}
}