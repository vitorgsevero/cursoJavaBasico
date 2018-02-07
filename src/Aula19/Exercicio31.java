package Aula19;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length]; 

		for(int i=0; i<vetorA.length; i++){
			System.out.println("Informe o valor de A:");
			vetorA[i] = ler.nextInt();
		}	
		
		int posicaoB=0;
		
		for(int i=0; i<vetorA.length; i++){
			if(vetorA[i] % 2 == 0){
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
			} 
		}	
		
		for(int i=0; i<vetorA.length; i++){
			if(vetorA[i] % 2 != 0){
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
			} 
		}	
		
		System.out.println("VETOR A:");
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
		
		System.out.println("VETOR B:");
		for(int i=0; i<vetorB.length; i++){
			System.out.println(vetorB[i]);
		}
		
	}

}
