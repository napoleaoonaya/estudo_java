package br.com.xti.poo.construtores;

/**
 * 
 * Construtores
 * 
 * @author napoleao.kazu.onaya
 *
 */

public class Construtor {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroACem;
	
	/**
	 * Todo construtor tem o mesmo nome da classe 
	 * 
	 * Atenção se removermos o construtor vazio, só poderemos utilizar 
	 * um construtor com parametros
	 */
	
	/**
	 * Construtor vazio 
	 */
	public Construtor() {
	}
	
	
	/**
	 * Construtor com parametros
	 * inicializados
	 */
	public Construtor(String modelo, int velocidadeMaxima, double segundosZeroACem) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroACem = segundosZeroACem;
	}
	
	
}
