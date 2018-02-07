package Aula19;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length*2];
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Informe o valor de A:");
			vetorA[i] = ler.nextInt();
			
			vetorC[i] = vetorA[i];
		}	
		
		for(int i=0; i<vetorB.length; i++){
			System.out.println("Informe o valor de B:");
			vetorB[i] = ler.nextInt();
			
			vetorC[vetorA.length+i] = vetorB[i]; //COMEÇANDO A PARTIR DA POSIÇÃO 10
			
		}	
		
		System.out.println("VETOR A:");
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
		
		System.out.println("VETOR B:");
		for(int i=0; i<vetorB.length; i++){
			System.out.println(vetorB[i]);
		}
		System.out.println("VETOR C:");
		for(int i=0; i<vetorC.length; i++){
			System.out.println(vetorC[i]);
		}	
	}

}
