package br.com.xti.poo.polimorfismo.interfaces;

public class Cubo implements VolumeCalculavel, AreaCalculavel{
	
	double lado;
	
	public Cubo(double lado) {
		this.lado = lado;
	}
	

	@Override
	public double calcularVolume() {
		return (6 * lado * lado);
	}

	@Override
	public double calculoArea() {
		return (lado * lado * lado);
	}

	
}
