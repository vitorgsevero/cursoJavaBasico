package aula31;

public class Carro {
	public String marca; //public permite visibilidade para todos os acotes do Projeto
	String modelo; //default permite visibilidade somente dentro do Pacote
	private int numPassageiros; //private permite visibilidade somente dentro da Classe
	double capCombustivel;
	double consumoCombustivel;
	
	public void exibirAutonomia() {
		System.out.println("A autonomia é: " + (this.capCombustivel * this.consumoCombustivel) + " km.");
	}

	public double mostrarAutonomia() {

		System.out.println("OBTENDO AUTONOMIA.");

		return (this.capCombustivel * this.consumoCombustivel);

	}

	public double calcularCombustivel(double km) {

		double qtdCombustivel = km / this.consumoCombustivel;

		return qtdCombustivel;

	}
}
