package Aula19;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);	
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++){
			
			System.out.println("Informe um valor para o Vetor A:");
			vetorA[i] = ler.nextInt();
			
		}	
		
		int somaMultiplos=0;
		
		for(int i=0; i<vetorA.length; i++){
			if(vetorA[i] % 5 == 0){
				somaMultiplos = somaMultiplos + vetorA[i];
			}
		}
		
		System.out.println("\nExibindo o Vetor A:");
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
			
		System.out.println("\nSoma dos múltiplos de 5: " + somaMultiplos);		
	}

}
