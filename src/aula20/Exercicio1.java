package aula20;

import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int[][]matriz =  new int[4][4];
		
		Random randow = new Random();
		
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++){
				matriz[i][j] = randow.nextInt(100); //gera 100 valores aleatórios
			}
		}
		
		int maior = 0;
		int linha = 0;
		int col = 0;
		
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++){
				if(matriz[i][j] > maior){
					maior = matriz[i][j];
					linha = i;
					col = j;
				}
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Linha: " +linha);
		System.out.println("Coluna: " +col);
		
		
		

	}

}
