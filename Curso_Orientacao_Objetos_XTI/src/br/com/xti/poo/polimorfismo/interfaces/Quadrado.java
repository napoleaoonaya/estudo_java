package br.com.xti.poo.polimorfismo.interfaces;

/**
 * Para implementar uma interface usamos a palavra implements
 * 
 * @author napoleao.kazu.onaya
 *
 */

public class Quadrado implements AreaCalculavel{
	
	//Criando a variavel
	double lado;
	
	//Iniciamos a variavel dentro do construtor
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculoArea() {
		return (lado * lado);
	}

}
