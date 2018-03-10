package aula34;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int num;
        
        do{
            System.out.println("Informe um valor positivo:");
            num = ler.nextInt();
            
            if(num<0){
                System.out.println("Informe um valor positivo.");
            }
            
        }while(num<0);
        
        System.out.println(Calculadora.fatorial(num));
 
    }   
}
