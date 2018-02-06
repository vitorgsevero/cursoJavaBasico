package Aula19;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);	
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++){
			
			System.out.println("Informe um valor para o Vetor A:");
			vetorA[i] = ler.nextInt();	
		}	
		
		int somaImpar=0;
		int qtdImpar=0;
		for(int i=0; i<vetorA.length; i++){
			if(vetorA[i] % 2 == 1){
				 somaImpar = somaImpar + vetorA[i];
				 qtdImpar++;
			}
		}
		
		System.out.println("\nExibindo o Vetor A:");
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
			
		System.out.println("\nSoma dos Ímpares: " + somaImpar);		
		System.out.println("\nMédia dos Ímpares: " + (somaImpar/qtdImpar));
	}
		


}
