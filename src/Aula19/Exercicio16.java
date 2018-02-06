package Aula19;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);	
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++){
			
			System.out.println("Informe um valor para o Vetor A:");
			vetorA[i] = ler.nextInt();	
		}
		
		
		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int qtdMaior15 = 0;
		int igual15 = 0;
		
		for(int i=0; i<vetorA.length; i++){
			if(vetorA[i] == 15){
				igual15++;
			} else if(vetorA[i] < 15){
				somaMenor15 = somaMenor15 + vetorA[i];
			} else {
				qtdMaior15++;
				somaMaior15 = somaMaior15 + vetorA[i];
			}
		}
		System.out.println("\nExibindo o Vetor A:");
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
		
		System.out.println("\nQuantidade de números iguais a 15: " +igual15);
		System.out.println("Soma de números menores do que 15: " +somaMenor15);
		System.out.println("Média de números maiores do que 15: " +(somaMaior15/qtdMaior15));
	}

}
