import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import Algoritmos.Buble;
import Algoritmos.Insert;
import Algoritmos.Merge;
import Algoritmos.Quick;
import Algoritmos.SelectionSort;

import java.util.ArrayList;

public class Main {

	public static ArrayList<String> Leitura;

	public static void main(String[] args) {

		ArrayList<Float> Leit = new ArrayList<>();
		ArrayList<String> LeitString = new ArrayList<>();
		System.out.println("*****************************************************");
		Scanner entradaSC = new Scanner(System.in);

		System.out.printf("Informe o nome de arquivo texto:\n");
		String nome = entradaSC.nextLine();
		String Path = "C:/Users/Miguel/Desktop/";
		int aux = 0;

		try {
			FileReader arq = new FileReader(Path + nome + ".txt");
			BufferedReader lerArq = new BufferedReader(arq);

			String linha = lerArq.readLine();
			while (linha != null) {
				System.out.println(aux);
				System.out.printf("  %s\n", linha);
				linha = lerArq.readLine(); // lê da segunda até a última linha
				if ((linha != null) && (nome.equals("numeros_100000")))
					Leit.add(Float.parseFloat(linha)); // = Integer.parseInt(linha);
				if ((linha != null) && (nome.equals("palavras_100000")))
					LeitString.add(linha); // = Integer.parseInt(linha);

				aux++;
			}

			arq.close();

		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		entradaSC.close();
		
		
		System.out.println("*****************************************************");

		SelectionSort<Float> SC = new SelectionSort<Float>(); // SelectionSort en tipo Float.
		SelectionSort<String> SCString = new SelectionSort<String>(); // SelectionSort en tipo String.
		
		Buble<Float> BB = new Buble<Float>(); // BubbleSort en tipo Float.
		Buble<String> BBString = new Buble<String>(); // BubbleSort en tipo String. 
		
		Insert<Float> II = new Insert<Float>(); //InsertionSort en tipo Float.
		Insert<String> IIString = new Insert<String>(); //InsertionSort en tipo String.
		
		Merge<Float> MM = new Merge<Float>();
		Merge<String> MMString = new Merge<String>();
		
		Quick<Float> QQ = new Quick<Float>();
		Quick<String> QQString = new Quick<String>();
		
		if (nome.equals("numeros_100000"))
			//System.out.println("*** Numeros 100 mil ***");
			//System.out.println(SC.selectionSort(Leit));
			//System.out.println(BB.bubleSort(Leit))
			//System.out.println(II.insertSort(Leit));
			//System.out.println(MM.mergesort(Leit));
			System.out.println(QQ.quicksort(Leit, 0, Leit.size()-1));
		
		if (nome.equals("palavras_100000"))
			//System.out.println("*** Palavras 100 mil ***");
			//System.out.println(SCString.selectionSort(LeitString));
			//System.out.println(BBString.bubleSort(LeitString));
			//System.out.println(IIString.insertSort(LeitString));
			//System.out.println(MMString.mergesort(LeitString));
			System.out.println(QQString.quicksort(LeitString, 0, LeitString.size()-1));

	}
}