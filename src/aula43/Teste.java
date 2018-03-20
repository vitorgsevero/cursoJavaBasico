package aula43;

public class Teste {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        aluno.setCurso("Análise e Desenvolvimento de Sistemas");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);
        
        System.out.println(aluno);
        
        System.out.println(aluno.toString());
        
        String test = "Comparando objetos";
        String test2 = "Comparando OBjetos";
        
        System.out.println(test.equalsIgnoreCase(test2));
        
        Aluno aluno2 = new Aluno();
        
        aluno.setCurso("Análise e Desenvolvimento de Sistemas");
        double[] notas2 = {10, 9, 8, 7};
        aluno2.setNotas(notas2);
        
        System.out.println(aluno == aluno2); //compara as referências
        System.out.println(aluno.equals(aluno2));
        
    } 
}
