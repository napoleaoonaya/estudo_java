package br.com.xti.poo.relacionamento.tem.um.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		ferrari.modelo = "Z1";
		ferrari.segundosDeZeroACem = 10;
		ferrari.velocidadeMaxima = 500;
		
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 620;
		
		ferrari.motor = v12;//adiciona o motor
		
		Carro k = new Carro();
		Motor v8 = new Motor("V8", 1250);
		k.motor = v8;
		
		System.out.println(k.motor.potencia);
		
		Carro bugatti = new Carro("Bugatti Veron", 500, 1.0, new Motor("V12", 1200));
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.motor.potencia);
		
		
		
	}
}
