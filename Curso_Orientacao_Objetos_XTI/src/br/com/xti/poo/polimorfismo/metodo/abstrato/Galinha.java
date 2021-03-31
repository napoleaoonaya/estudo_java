package br.com.xti.poo.polimorfismo.metodo.abstrato;

//Se a classe for abstrata ela não precisa implementar método do Animal
//public abstract class Galinha extends Animal{}

public class Galinha extends Animal {
	
	//Super faz referencia a super classe
	
	public Galinha() {
		super(2,"Alpiste");
	}
	
	void fazerBarulho() {
		System.out.println("Co Co Co!!");
	}

	@Override
	void fazerBarulhoAbstrato() {
		System.out.println("Co Co Abstrato!");
		
	}

}
