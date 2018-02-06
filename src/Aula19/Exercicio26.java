package Aula19;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Informe o valor de A:");
			vetorA[i] = ler.nextInt();
		}
		
		for(int i=0; i<vetorB.length; i++){
			System.out.println("Informe o valor de B:");
			vetorB[i] = ler.nextInt();
			
			if(vetorA[i]==vetorB[i]){
				vetorC[i] = 0;
			} else if(vetorA[i]>vetorB[i]){
				vetorC[i] = 1;
			} else {
				vetorC[i] = -1;
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
		System.out.println("VETOR C:");
		for(int i=0; i<vetorC.length; i++){
			System.out.println(vetorC[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
