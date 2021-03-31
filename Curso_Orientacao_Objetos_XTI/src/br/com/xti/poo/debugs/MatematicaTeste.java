package br.com.xti.poo.debugs;

public class MatematicaTeste {

	public static void main(String[] args) {
		
		Matematica mat = new Matematica();
		
		double x = 23;
		double y = 10;
		
		double resultado = mat.soma(x, y);

		System.out.println(resultado);
	}

}
