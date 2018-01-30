package Aula18;
import java.util.Scanner;
public class continueJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int n = ler.nextInt();
		
		System.out.println("Entre com um limite:");
		int limite = ler.nextInt();
		
			for(int i=n; i<=limite; i++){
				
				if(i % 7 == 0){
					continue;	
				}
				System.out.println("Valor de I: " + i);
			}
		
		
	}

}
