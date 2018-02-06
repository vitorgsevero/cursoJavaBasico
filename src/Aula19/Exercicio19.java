package Aula19;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);	
		
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] resultados = new double[notas1.length];
		
		for(int i=0; i<notas1.length; i++){
			System.out.println("Informe a nota 1 do aluno " + (i+1) + ":");
			notas1[i] = ler.nextDouble();	
			System.out.println("Informe a nota 2 do aluno " + (i+1) + ":");
			notas2[i] = ler.nextDouble();	

			resultados[i] = notas1[i] + notas2[i]/2;
		}
		
		System.out.println("\nNotas 1:");
		for(int i=0; i<notas1.length; i++){
			System.out.println(notas1[i]);
		}
		
		System.out.println("\nNotas 2:");
		for(int i=0; i<notas2.length; i++){
			System.out.println(notas2[i]);
		}
		
		System.out.println("\nResultados:\n");
		for(int i=0; i<resultados.length; i++){	
			if(resultados[i]>=7){
				System.out.println(resultados[i] + ", Aprovado.");
			} else {
				System.out.println(resultados[i] + ", Reprovado.");
			}
		}
		
	}

}
