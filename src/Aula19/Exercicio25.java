package Aula19;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Informe o valor:");
			vetorA[i] = ler.nextInt();
			
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0; //OPERADOR TERNÁRIO - ? (IF) : (ELSE)
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
