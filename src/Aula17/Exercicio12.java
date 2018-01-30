package Aula17;

import java.util.Scanner;
public class Exercicio12 {

	public static void main (String[] args){
		
		int num;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("informe o numero que deseja ver a tabuada:");
		num = ler.nextInt();
		
		System.out.println("Tabuada do num " + num);
		
		for(int i=0; i<=10; i++){
				
			System.out.println(i + "X" + num + ": " + (i*num));
				
			}
			
		
	}
	
	
}
