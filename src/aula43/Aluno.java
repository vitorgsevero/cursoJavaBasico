package aula43;

import java.util.Arrays;
import java.util.Objects;

public class Aluno {

    private String curso;
    private double[] notas;

    Aluno() {
            }
    
    
    public void verificarAcesso(){
        //this.nomeVisibilidade = "Teste";
       // super.nomeVisibilidade = "Teste";
    }
    
    public Aluno(String nome, String endereco, String telefone){
   //  super(nome, endereco, telefone);
     this.curso = curso; //Própia Classe
    }
    
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia(){
        return 0;
    }
    
    public boolean verificarAprovado(){
        return true;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        Aluno other = (Aluno) obj;
   
        if(curso.equalsIgnoreCase(other.getCurso())){
            return true;
        }
        return true;
    }
    
    
    
    

    
    
    
}
