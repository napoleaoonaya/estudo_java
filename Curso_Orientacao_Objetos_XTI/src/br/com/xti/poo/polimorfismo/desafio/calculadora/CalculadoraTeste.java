package br.com.xti.poo.polimorfismo.desafio.calculadora;

public class CalculadoraTeste {
	
	public static void calcular(String titulo,OperacaoMatematica opm, double x, double y) {
		System.out.println(titulo+" = "+opm.calcular(x, y));
	}

	public static void main(String[] args) {
		
		calcular("Soma",new Soma(), 12, 3);
		calcular("Multiplicação",new Multiplicacao(), 12, 3);
		calcular("Divisão",new Divisao(), 12, 3);
		calcular("Subtração",new Subtracao(), 12, 3);

	}

}
