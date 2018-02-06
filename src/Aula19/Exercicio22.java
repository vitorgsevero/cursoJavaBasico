package Aula19;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetorA = new int[10];
		int qtd0=0;
		int qtd1=0;
		
		for(int i=0; i<vetorA.length; i++){
			vetorA[i] = (int)Math.round(Math.random()*1); //utilizando cast pra ter o resultado inteiro mesmo com o retorno da função sendo um double
			
			if(vetorA[i]==0){
				qtd0++;
			}else{
				qtd1++;
			}	
		}
		
		double percent0 = (qtd0*100)/vetorA.length;
		double percent1 = (qtd1*100)/vetorA.length;
		
		for(int i=0; i<vetorA.length; i++){
			System.out.println(vetorA[i]);
		}
		
		System.out.println("\nPorcentagem de 0: " + percent0);
		System.out.println("\nPorcentagem de 1: " + percent1);
		
		
	}

}
