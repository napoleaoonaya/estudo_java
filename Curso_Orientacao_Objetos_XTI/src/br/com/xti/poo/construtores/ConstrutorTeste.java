package br.com.xti.poo.construtores;

public class ConstrutorTeste {

	public static void main(String[] args) {
		
		Construtor ferrari = new Construtor();
		ferrari.modelo = "Z1";
		ferrari.segundosZeroACem = 10;
		ferrari.velocidadeMaxima = 500;
		
		System.out.println(
				"Modelo: "+ ferrari.modelo +
				" - Segundos de zero a cem: "+ ferrari.segundosZeroACem +
			    " - Velociadade maxima: "+ ferrari.velocidadeMaxima);
		
		Construtor fiat = new Construtor("Uno Mile", 120, 60);
		System.out.println(
				"Modelo: "+ fiat.modelo +
				" - Segundos de zero a cem: "+ fiat.segundosZeroACem +
			    " - Velociadade maxima: "+ fiat.velocidadeMaxima);
		
	}
}
