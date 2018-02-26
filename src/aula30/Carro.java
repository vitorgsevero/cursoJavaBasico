package aula30;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca; //this é referente ao atributo
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {}

	public Carro(String marca, String modelo) {
		this("Fiat", "Ducato", 10); //Utilizando o this como construtor, passando o outro o construtor
		this.marca = marca;
		this.modelo = modelo;
		
		System.out.println("Chamando construtores com 2 parâmetros.");
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		
		System.out.println("Chamando construtores com 3 parâmetros.");
	}

	void exibirAutonomia() {
		System.out.println("A autonomia é: " + (this.capCombustivel * this.consumoCombustivel) + " km.");
	}

	double mostrarAutonomia() {

		System.out.println("OBTENDO AUTONOMIA.");

		return (this.capCombustivel * this.consumoCombustivel);

	}

	double calcularCombustivel(double km) {

		double qtdCombustivel = km / this.consumoCombustivel;

		return qtdCombustivel;

	}
}
