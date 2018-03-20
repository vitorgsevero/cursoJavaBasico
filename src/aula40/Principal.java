package aula40;

public class Principal {
    
    public static void main(String[] args) {
     
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        pessoa.setEndereco("Rua de Teste");
        aluno.setEndereco("Rua de Teste 2");
        professor.setEndereco("Rua de Teste 3");
        
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
        
    }
}
