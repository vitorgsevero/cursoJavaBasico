package Aula18;
import java.util.*;
public class breakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com um numero:");
		int n = ler.nextInt();
		
		System.out.println("Entre com um limite:");
		int limite = ler.nextInt();
		
			for(int i=n; i<=limite; i++){
				
				if(i % 7 == 0){
					System.out.println("Valor de I: " + i);
					break;
					
				}
				
			}*/
		
		for (int i=0; i<=4; i++){
			
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if (i==1){
							break rotulo1;
						}
						if (i==2){
							break rotulo2;
						}
						if (i==3){
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
		
				}
				System.out.println("rotulo1");
			}
			System.out.println(i);
		
		
		}
		
		
	}

}
