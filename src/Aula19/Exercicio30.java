package Aula19;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length]; //par
		int[] vetorC = new int[vetorA.length]; //ímpar
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Informe o valor de A:");
			vetorA[i] = ler.nextInt();
		}	
		
		int posB = 0;
		int posC = 0;
		
		for(int i=0; i<vetorA.length; i++){
			if(vetorA[i] % 2 == 0){
				vetorB[posB] = vetorA[i];
				posB++;
			} else {
				vetorC[posC] = vetorA[i];
				posC++;
			}
		}	
		
		System.out.println("VETOR A:");
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
		
		System.out.println("VETOR B:");
		for(int i=0; i<posB; i++){
			System.out.println(vetorB[i]);
		}
		System.out.println("VETOR C:");
		for(int i=0; i<posC; i++){
			System.out.println(vetorC[i]);
		}
		
		
	}

}
