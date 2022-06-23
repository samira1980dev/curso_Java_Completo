package arraysEcollections;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio001 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas voce quer colocar? ");
		int qtdNotas = entrada.nextInt();
		
		double notas [] = new double [qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Insira a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextInt();
		}
		
		double total = 0;
		for (double nota: notas) {
			total += nota;
		}
		
		System.out.println("A media eh : " + (total / notas.length));
		
		
		
		entrada.close();
		
	}

}
