package br.com.xti.poo;

public class CachorroTeste {
	
	public static void main(String[] args) {
		
		Cachorro pitbull = new Cachorro();
		
		pitbull.raca = "Pitbull";
		pitbull.porte = "porte grande";
		pitbull.tamanho = 150;
		
		System.out.println("Ra�a: "+pitbull.raca);
		System.out.println("Porte: "+pitbull.porte);
		System.out.println("Tamanho: "+pitbull.tamanho+"cm");
		
		pitbull.latir();
		
		System.out.println("----------------------------------");
		
		Cachorro viralata = new Cachorro();
		
		viralata.raca = "Viralatas";
		viralata.porte = "porte m�dio";
		viralata.tamanho = 120;
		
		System.out.println("Ra�a: "+viralata.raca);
		System.out.println("Porte: "+viralata.porte);
		System.out.println("Tamanho: "+viralata.tamanho+"cm");
		
		viralata.latir();
		
	}

}
