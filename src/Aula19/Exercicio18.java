package Aula19;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);	
		
		int[] idades = new int[10];
		
		for(int i=0; i<idades.length; i++){
			System.out.println("Informe uma idade para a " + (i+1) + "º pessoa:");
			idades[i] = ler.nextInt();	
		}

		int menorIdade = idades[0];
		int indexMenor = 0;
		int maiorIdade = idades[0];
		int indexMaior = 0;
		
		for(int i=1; i<idades.length; i++){
			if(idades[i]>maiorIdade){
				maiorIdade = idades[i];
				indexMaior = i;
			}else if(idades[i] < menorIdade){
				menorIdade = idades[i];
				indexMenor = i;
			}
			
		}
		
		System.out.println("\nMenor idade: " + menorIdade);
		System.out.println("Índice da menor idade: " + indexMenor);
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Índice da maior idade: " + indexMaior);
	}

}
