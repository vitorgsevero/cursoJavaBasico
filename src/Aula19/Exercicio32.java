package Aula19;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner ler = new Scanner (System.in);
		
		int[] vetorA = new int[5];

		for(int i=0; i<vetorA.length; i++){
			System.out.println("Informe a tabuada que você deseja ver:");
			vetorA[i] = ler.nextInt();
		}	
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("\nTabuada de " + vetorA[i]);
			
			for(int j=1; j<=10; j++){
				System.out.println(j + " X " + vetorA[i] + ": " + (vetorA[i]*j));
			}
			
		}
		
		System.out.println();
		
		

	}

}
