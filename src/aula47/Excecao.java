package aula47;

public class Excecao {
   
    public static void main(String[] args) {
       
        
        try{
            
            int vetor[] = new int[4];

            System.out.println("Antes da exception");

            vetor[4] = 1;
        
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Exceção ao acessar um índice do vetor que não existe");
        }
        
        System.out.println("Esse texto será exibido");
       
        
        
    }
  
}
