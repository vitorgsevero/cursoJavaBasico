package Aula19;

import java.util.Scanner;
public class Exercicio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Informe um valor:");
			vetorA[i] = ler.nextInt();
			vetorB[i] = vetorA[i]*2;	
		}

		System.out.println("\nVetor A");
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
			
		}
		
		System.out.println("\nVetor B");
		
		for(int i=0; i<vetorB.length; i++){
			System.out.println(vetorB[i]);
			
		}
		
	}
}	