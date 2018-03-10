package aula34;


public class Exercicio1 {
    
    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    
    public static void main(String[] args) {
        
       Contador.incrementar(); 
       //Utilizando o método de outra classe 
       //sem precisar instaciar a classe de onde vem o método

       imprimirValor();
       
       Contador.zerar();
       
       imprimirValor();

    }  
    
}
