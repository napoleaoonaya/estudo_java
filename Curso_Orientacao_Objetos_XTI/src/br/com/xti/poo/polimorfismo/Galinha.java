package br.com.xti.poo.polimorfismo;

public class Galinha extends Animal {
	
	//Super faz referencia a super classe
	
	public Galinha() {
		super(2,"Alpiste");
	}
	
	void fazerBarulho() {
		System.out.println("Co Co Co!!");
	}

}
