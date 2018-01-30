package Aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	
	int[] vetorA = new int[15];
	double[] vetorB = new double[vetorA.length];
	
	for(int i=0; i<vetorA.length; i++){
		System.out.println("Informe um valor:");
		vetorA[i] = ler.nextInt();
		vetorB[i] = Math.sqrt(vetorA[i]);	
	}

	System.out.println("\nVetor A");
	
	for(int i=0; i<vetorA.length; i++){
		System.out.println(vetorA[i]);
		
	}
	
	DecimalFormat df = new DecimalFormat("###,###.##");
	
	System.out.println("\nVetor B (raíz quadrada)");
	
	for(int i=0; i<vetorB.length; i++){
		System.out.println(df.format(vetorB[i]));
		
	}
	
}
	
	
}
