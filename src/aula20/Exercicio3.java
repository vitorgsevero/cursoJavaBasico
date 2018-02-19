package aula20;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int[][] num = new int [3][3];
		
		int qtdPar=0;
		int qtdImpar=0;
		
		for(int i=0; i<num.length; i++){
			for(int j=0; j<num[i].length; j++){
				System.out.println("Informe um valor para (" + i + " - " + j + ")");
				num[i][j] = ler.nextInt();
				
				
				if (num[i][j] % 2 == 0){
					qtdPar++;
				} else {
					qtdImpar++;
				}
				
			}
		}
		
		System.out.println("EXIBINDO OS VALORES DA MATRIZ PREENCHIDA");
		
		for(int i=0; i<num.length; i++){
			for(int j=0; j<num[i].length; j++){
				System.out.print(num[i][j] + " ");
			}
		}
		
		System.out.println("\nQuantidade de números pares: " + qtdPar);
		System.out.println("Quantidade de números ímpares: " + qtdImpar);
		
	}

}
