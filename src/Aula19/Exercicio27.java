package Aula19;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Informe o valor de A:");
			vetorA[i] = ler.nextInt();
			
			if(vetorA[i]<7){
				vetorB[i]='a'; 
			} else if(vetorA[i]==7){
				vetorB[i]='b';
			} else if (vetorA[i] > 7 && vetorA[i]<10){
				vetorB[i]='c';
			} else if (vetorA[i]==10){
				vetorB[i]='d';
			} else if (vetorA[i]>10){
				vetorB[i]='e';
			}
		}
		
		System.out.println("VETOR A:"); 
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
		System.out.println("VETOR B:"); //SAÍDA COM OS VALORES DA TABELA ASCII
		for(int i=0; i<vetorB.length; i++){
			System.out.println(vetorB[i]);
		}
	}

}
