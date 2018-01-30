package Aula19;

import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);	
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++){
			
			System.out.println("Informe um valor para o Vetor A:");
			vetorA[i] = ler.nextInt();
			System.out.println("Informe um valor para o Vetor B:");
			vetorB[i] = ler.nextInt();
			
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("\nExibindo o Vetor A:");
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
		
		System.out.println("\nExibindo o Vetor B:"); 
		
		for(int i=0; i<vetorB.length; i++){
			System.out.println(vetorB[i]);
		}	
		
		System.out.println("\nExibindo o Vetor C:"); //SOMA DOS RESPECTIVOS ELEMENTO DE A E B
		for(int i=0; i<vetorC.length; i++){
			System.out.println(vetorC[i]);
		}
	}

}
