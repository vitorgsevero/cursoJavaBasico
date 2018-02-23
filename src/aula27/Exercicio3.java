package aula27;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Informe o nome do Aluno: ");
		aluno.nome = ler.nextLine();

		System.out.println("Informe o nome do Curso: ");
		aluno.nomeCurso = ler.nextLine();

		System.out.println("Informe o matrícula do Aluno: ");
		aluno.matricula = ler.nextLine();

		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) { //Adicionando os nomes da disciplinas
			System.out.println("Informe o nome da disciplina: ");
			aluno.nomeDisciplinas[i] = ler.nextLine();
		}
		
		for(int i=0; i<aluno.notasDisciplinas.length; i++){ //Adicionando as notas do notas nas disciplinas informadas
			System.out.println("\nNotas da Disciplina " + aluno.nomeDisciplinas[i]);
			for(int j=0; j<aluno.notasDisciplinas[i].length; j++){
				System.out.println("Informe a nota " + (j+1));
				aluno.notasDisciplinas[i][j] = ler.nextDouble();
			}
		}
		
		aluno.mostrarInfo();
		
	       for (int i=0; i<aluno.nomeDisciplinas.length; i++){
	            if (aluno.verificarAprovado(i)){
	                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
	            } else {
	                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - reprovado");
	            }
	}

	}

}
