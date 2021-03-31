package br.com.xti.poo.polimorfismo;

public class Cachorro extends Animal {
	
	double peso;
	
	//Super faz referencia a super classe
	
	public Cachorro() {
		super(10,"Carne");
		
		//Peso do cachorro
		//this.peso = peso;
		//Peso do Animal da Super Classe
		//super.peso = peso;
		
	}
	
	void fazerBarulho() {
		System.out.println("Au Au Au !");
	}

}
