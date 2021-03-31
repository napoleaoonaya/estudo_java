package br.com.xti.poo.sobrecarga.metodos;

public class MetodoSobrecargaTeste {
	
	public static void main(String[] args) {
		MetodoSobrecarregado ms = new MetodoSobrecarregado();
		
		double resultado = ms.media(2, 4);
		
		System.out.println(resultado);
		
		double result = ms.media("23", "12");
		
		System.out.println(result);
		
		System.out.println(ms.media(1));
		
		System.out.println(ms.media(1,2,3,4));
	}

}
