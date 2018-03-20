package aula45;

public class Teste {
    
    public static void main(String[] args) {
        
    /*Aluno aluno = new Aluno();
    Pessoa pessoaAluno = aluno; //upcasting //transformando uma classe maior em um tipo de classe maior
    
    Pessoa aluno2 = (Pessoa) new Aluno();
    
    Pessoa aluno3 = new Pessoa(); //downcasting
    
    Aluno aluno4 = (Aluno) aluno3;*/
        
    Pessoa pessoa = new Pessoa();
    Aluno aluno = new Aluno();
    Professor prof = new Professor();
    
    
    if (pessoa instanceof Pessoa){ //Instanceof permite verificar qual é tipo 
        System.out.println("É do tipo pessoa");
    }
    
    if (aluno instanceof Aluno){
        System.out.println("É do tipo aluno");
    }
      
     if (prof instanceof Professor){
        System.out.println("É do tipo professor");
    }
     
    }
}
