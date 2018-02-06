package Aula19;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);	
		
		double[] vetorA = new double[10];
		
		for(int i=0; i<vetorA.length; i++){
			
			System.out.println("Informe um valor para o Vetor A:");
			vetorA[i] = ler.nextInt();	
		}	
		
		double qtdImpar=0;
		for(int i=0; i<vetorA.length; i++){
			if(vetorA[i] % 2 == 1){
				 qtdImpar++;
			}
		}
		
		double qtdPar = vetorA.length - qtdImpar;
		double percentPar = (qtdPar*100)/vetorA.length;
		double percentImpar = (qtdImpar*100)/vetorA.length;
		
		System.out.println("\nPorcentagem de Pares: " + percentPar);
		System.out.println("Porcentagem de Ímpares: " + percentImpar);
		
	}

}
