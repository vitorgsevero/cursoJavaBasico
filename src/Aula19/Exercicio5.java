package Aula19;
import java.util.*;
public class Exercicio5 {

	public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);	
		
	int[] vetorA = new int[10];
	int[] vetorB = new int[10];
	
	for(int i=0; i<vetorA.length; i++){
		
		System.out.println("Informe um valor:");
		vetorA[i] = ler.nextInt();
		vetorB[i] = vetorA[i] * i;
	}
	
	System.out.println("Exibindo o Vetor A:");
	
	for(int i=0; i<vetorA.length; i++){
		System.out.println(vetorA[i]);
	}
	
	System.out.println("Exibindo o Vetor B:"); //Valor de A * sua posição
	
	for(int i=0; i<vetorB.length; i++){
		System.out.println(vetorB[i]);
	}	
		
	}
}
