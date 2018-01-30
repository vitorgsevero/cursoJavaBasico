package Aula19;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double[] temperaturas = new double [365];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 39.3;
		temperaturas[2] = 34.3;
		temperaturas[3] = 25.3;
		temperaturas[4] = 32.3;
		
		for (int i=0; i<temperaturas.length; i++){
			
			System.out.println("O valor da temperatura no dia "+(i+1)+":" +temperaturas[i]);
			
		}
		
		System.out.println("O tamanho do array: " + temperaturas.length);

		for(double temp : temperaturas){ //for melhorado, porém não pega o índice i, acesso somente ao valor
			System.out.println(temp);
		}
	
	}

}
