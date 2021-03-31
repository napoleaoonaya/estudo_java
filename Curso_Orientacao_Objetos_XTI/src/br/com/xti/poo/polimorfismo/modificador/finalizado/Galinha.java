package br.com.xti.poo.polimorfismo.modificador.finalizado;

//Se a classe for abstrata ela n�o precisa implementar m�todo do Animal
//public abstract class Galinha extends Animal{}

public class Galinha extends Animal {
	
	//Super faz referencia a super classe
	
	public Galinha() {
		super(2,"Alpiste");
	}
	
	final void fazerBarulho() {
		System.out.println("Co Co Co!!");
	}

	@Override
	void fazerBarulhoAbstrato() {
		System.out.println("Co Co Abstrato!");
		
	}

}
