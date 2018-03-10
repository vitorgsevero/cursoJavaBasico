package aula34;

public class Exercicio2 {
    
    public static void main(String[] args) {
       
        imprimirTela(Calculadora.somar(1,2));
        
        imprimirTela(Calculadora.subtrair(2, 1));
        
        imprimirTela(Calculadora.multiplicar(2, 2));
        
        imprimirTela(Calculadora.dividir(4, 2));
        
        imprimirTela(Calculadora.potencia2(2, 3));
    
    }
   
    static void imprimirTela(int n1){
          System.out.println(n1);
     
    }    
        
        
}   

