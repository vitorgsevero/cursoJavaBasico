package Aula19;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);	
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Informe uma idade para a " + (i+1) + "º pessoa:");
			vetorA[i] = ler.nextInt();	
		}
		int idadeMaior35=0;
		for(int i=0; i<vetorA.length; i++){
			if(vetorA[i]>35){
				idadeMaior35++;
			}
		}
		
		System.out.println("\nExibindo o Vetor A:");
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
		
		System.out.println("\nQuantidade de pessoas maiores de 35 anos: " + idadeMaior35 + " pessoas.");
		
		
		
	}

}
