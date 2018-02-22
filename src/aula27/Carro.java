package aula27;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

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
