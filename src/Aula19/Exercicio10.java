package Aula19;

import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);	
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++){
			
			System.out.println("Informe um valor para o Vetor A:");
			vetorA[i] = ler.nextInt();
			
			vetorB[i] = vetorA[i] % 2;
		
		}
		
		System.out.println("\nExibindo o Vetor A:");
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
		
		System.out.println("\nExibindo o Vetor B:"); 
		
		for(int i=0; i<vetorB.length; i++){
			System.out.println(vetorB[i]);
		}	
		

	}

}
