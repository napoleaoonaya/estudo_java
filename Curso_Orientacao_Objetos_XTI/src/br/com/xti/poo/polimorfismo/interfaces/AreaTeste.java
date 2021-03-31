package br.com.xti.poo.polimorfismo.interfaces;

public class AreaTeste {
	
	public static void main(String[] args) {
		
		Quadrado qd = new Quadrado(2);
		
		double resultado = qd.calculoArea();
		
		System.out.println(resultado);
		
	}

}
