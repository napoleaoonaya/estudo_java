package br.com.xti.poo.heranca.topico.avancado;

public class Animal {
	
	//acesso geral
	//int serial;
	
	//não aparece mais as subclasse
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

}
