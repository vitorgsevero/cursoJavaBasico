package aula24;

public class TesteCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro van = new Carro();
		
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		
		Carro fusca = new Carro();
		
		fusca.marca = "Volkswagen";
		fusca.modelo = "Fusca";
		fusca.numPassageiros = 5;
		fusca.capCombustivel = 50;
		fusca.consumoCombustivel = 0.2;
		
		System.out.println(fusca.marca);
		
		

	}

}
