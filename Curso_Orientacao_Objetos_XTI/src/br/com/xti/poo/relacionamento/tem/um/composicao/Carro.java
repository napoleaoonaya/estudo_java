package br.com.xti.poo.relacionamento.tem.um.composicao;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosDeZeroACem;
	
	//Adicionando um motor
	Motor motor;
	
	public Carro() {
	}
	
// this() chama o construtor padrão
//	public Carro(String modelo, int velocidadeMaxima, double segundosDeZeroACem) {
//		this();
//	}
	
// this(parametros)	
	public Carro(String modelo, int velocidadeMaxima, double segundosDeZeroACem) {
		this(modelo,velocidadeMaxima,segundosDeZeroACem, null);
	}
	
//	public Carro(String modelo, int velocidadeMaxima, double segundosDeZeroACem) {
//		super();
//		this.modelo = modelo;
//		this.velocidadeMaxima = velocidadeMaxima;
//		this.segundosDeZeroACem = segundosDeZeroACem;
//	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosDeZeroACem, Motor motor) {
		super();
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosDeZeroACem = segundosDeZeroACem;
		this.motor = motor;
	}
	
	
	

}
