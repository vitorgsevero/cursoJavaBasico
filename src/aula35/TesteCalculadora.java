package aula35;

public class TesteCalculadora {
    
    public static void main(String[] args) {
        
        int fatorialNR = Calculadora.fatorialNaoRecursivo(4);
        System.out.println(fatorialNR);
        
        int fatorialR = Calculadora.fatorial(4);
        System.out.println(fatorialR);
        
    } 
}
