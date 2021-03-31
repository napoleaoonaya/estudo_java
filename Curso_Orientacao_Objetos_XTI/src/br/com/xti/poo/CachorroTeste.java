package br.com.xti.poo;

public class CachorroTeste {
	
	public static void main(String[] args) {
		
		Cachorro pitbull = new Cachorro();
		
		pitbull.raca = "Pitbull";
		pitbull.porte = "porte grande";
		pitbull.tamanho = 150;
		
		System.out.println("Raça: "+pitbull.raca);
		System.out.println("Porte: "+pitbull.porte);
		System.out.println("Tamanho: "+pitbull.tamanho+"cm");
		
		pitbull.latir();
		
		System.out.println("----------------------------------");
		
		Cachorro viralata = new Cachorro();
		
		viralata.raca = "Viralatas";
		viralata.porte = "porte médio";
		viralata.tamanho = 120;
		
		System.out.println("Raça: "+viralata.raca);
		System.out.println("Porte: "+viralata.porte);
		System.out.println("Tamanho: "+viralata.tamanho+"cm");
		
		viralata.latir();
		
	}

}
