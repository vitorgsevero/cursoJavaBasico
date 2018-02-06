package Aula19;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);	
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Informe a cotação do dólar:");
		cotacao = ler.nextDouble();
		
		for(int i=0; i<vetorA.length; i++){
			vetorA[i] = cotacao*(i+1);
		}
		
		System.out.println("\nVetorA:");
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
			
		
	}

}
