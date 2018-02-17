package aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 8.5;
		
		notasAlunos[1][0] = 10;
		notasAlunos[1][1] = 9;
		notasAlunos[1][2] = 8;
		notasAlunos[1][3] = 5;
		
		notasAlunos[2][0] = 6;
		notasAlunos[2][1] = 7;
		notasAlunos[2][2] = 5;
		notasAlunos[2][3] = 5.4;

		
		for(int i=0; i<notasAlunos.length; i++){
			for(int j=0; j<notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}
		
		notasAlunos[1][3] = 1;
		
		System.out.println();
		
		for(int i=0; i<notasAlunos.length; i++){
			for(int j=0; j<notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nCalculando a média de cada aluno");
		double soma;
		for(int i=0; i<notasAlunos.length; i++){
			soma = 0;
			for(int j=0; j<notasAlunos[i].length; j++){
				soma = soma + notasAlunos[i][j];
			}
	
			System.out.println("Média do aluno " +(i+1)+ ": "+(soma/4));
		}
		
		

	}
	
	
	
	

}
