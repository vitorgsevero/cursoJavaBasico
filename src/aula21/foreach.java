package aula21;

import java.util.Random;

public class foreach {

	public static void main(String[] args) {

		int[]notas = new int[10];
		
		Random random = new Random(); // Preenche o array com valores aleatórios
		
		for (int i=0; i<notas.length; i++){
			
			notas[i] = random.nextInt(10);
			
		}
		
		for(int i=0; i<notas.length; i++){
			System.out.println(notas[i]);
		}

		System.out.println("\nFOR EACH!"); // sem acesso ao contador que faz a iteração do array
		
		for(int nota : notas){ //não funciona para leitura de teclado //tipos primitivos não funciona, apenas objetos
			System.out.println(nota); //para output pode ser utilizado sem erros
		}
		
		
			
		
		
		
	}

}
