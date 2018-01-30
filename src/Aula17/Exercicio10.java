package Aula17;
import java.util.Scanner;
public class Exercicio10 {

	public static void main (String[] args){
		
		int num1;
		int num2;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("informe o primeiro valor:");
		num1 = ler.nextInt();
		System.out.println("informe o segundo valor:");
		num2 = ler.nextInt();
		
		
		
		for(int i=num1; i<=num2; i++){
				
				System.out.println(i);
				
			}
			
		
	}
	
	
}
