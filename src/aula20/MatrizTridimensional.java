package aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		int[][][] matriz = new int[3][3][3];
		
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++){
				for(int k=0; k<matriz[i][j].length; k++){
					System.out.println("i = " + i + " - j = " + j + " - k = " + k);
					matriz[i][j][k] = i+j+k;
				}
			}
		}
		
		int soma=0;
		int somaPares=0;
		int somaImpares=0;
		
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz[i].length; j++){
				for(int k=0; k<matriz[i][j].length; k++){
					
					soma = soma + matriz[i][j][k];
					
					if(matriz[i][j][k] % 2 == 0){
						somaPares += matriz[i][j][k];
					}else{
						somaImpares+= matriz[i][j][k];
					}
				}
			}
		}
		
		System.out.println("\nSoma total: " +soma);
		System.out.println("Soma dos Pares: " + somaPares);
		System.out.println("Soma dos Impares: " + somaImpares);
		

	}

}
