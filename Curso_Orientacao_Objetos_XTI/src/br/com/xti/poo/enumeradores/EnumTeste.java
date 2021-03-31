package br.com.xti.poo.enumeradores;

public class EnumTeste {
	
	public static final double PI = 3.14;
	
	public static void andar(Medida medida, int total) {
		if(medida == Medida.M) {
			System.out.println("Você andou: "+total+" "+medida.titulo);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(PecasXadrez.BISPO);
		
		System.out.println(Medida.M.titulo);
		
		//Percorrer todas constantes de um enum
		for (Medida m : Medida.values()) {
			System.out.println(m + " : "+m.titulo);
		}
		
		andar(Medida.M, 100);
		
	}

}
