package br.com.xti.poo.polimorfismo.metodo.abstrato;

/**
 * Classe abstrata
 * 
 * pode ter m�todos com outros atributos de acesso
 * 
 * m�todos abstratos s�o obrigados a serem implementados para classe que os herdem 
 * 
 * @author napoleao.kazu.onaya
 *
 */

public abstract class Animal {
	
	//acesso geral
	//int serial;
	
	//n�o aparece mais as subclasse
	private int serial;

	//visto apenas para a subclasses
	protected int serial2;
	
	double peso;
	String comida;
	
	void domir() {System.out.println("zzzzz");}
	void fazerBarulho() {System.out.println("HuHaHu");}
	
	public Animal() {
	}
	
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	//M�todo para criar em classes que herdarem
	//M�todo sem corpo abstratos
	abstract void fazerBarulhoAbstrato();

}
