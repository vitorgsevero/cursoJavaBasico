package aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro(){
		System.out.println("Instanciando a classe carro");
	}
	
	public Carro(String marca){
		marca = this.marca;
	}

	void exibirAutonomia() {
		System.out.println("A autonomia é: " + (capCombustivel * consumoCombustivel) + " km.");
	}

	double mostrarAutonomia() {

		System.out.println("OBTENDO AUTONOMIA.");

		return (capCombustivel * consumoCombustivel);

	}

	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;

	}
	
}
