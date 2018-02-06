package Aula19;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);	
		
		int[] vetorA = new int[10];
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println("Informe os valores:");
			vetorA[i] = ler.nextInt();
			
		}	
		
		boolean palindromo = true;
		
		for(int i=0; i<(vetorA.length)/2; i++){
			if(vetorA[i] != vetorA[vetorA.length-1 -i]){
				palindromo = false;
				break;
			}
		}
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
		
		if(palindromo){
			System.out.println("Palindromo.");
		}else{
			System.out.println("Não é.");
		}
		
		
	
	}

}
