package aula20;

public class Matrizes2 {

	public static void main(String[] args) {
		
		double[][] notasAlunos = {{10,7, 9, 9}, {10, 9, 8, 5},{6, 7, 5, 5.4}};
		
		for(int i=0; i<notasAlunos.length; i++){
			for(int j=0; j<notasAlunos[i].length; j++){
				System.out.print(notasAlunos[i][j] + " ");
			}
			System.out.println();
		}

		
	}

}
