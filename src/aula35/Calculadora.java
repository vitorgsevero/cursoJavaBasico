package aula35;

public class Calculadora {
      
    public static int fatorialNaoRecursivo(int num){
        
        if(num == 0){
            return 1;
        }
        int total=1;
        for(int i=num; i>1; i--){
            total *= i;
        }
        return total;
    } 
    
    public static int fatorial(int num){ //Recursividade, um método sendo utilizado dentro do própio método
        
        if(num==0){
            return 1;
        }
        
     return num * fatorial(num-1);   //ex: fatorial (4) = 4 * fatorial(3)
    }
    
    
    
    
}
