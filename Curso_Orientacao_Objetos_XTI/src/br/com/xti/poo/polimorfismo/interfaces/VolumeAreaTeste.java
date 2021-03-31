package br.com.xti.poo.polimorfismo.interfaces;

public class VolumeAreaTeste {
	
	public static void main(String[] args) {
		
		Cubo cb = new Cubo(4.5);
		
		double area = cb.calculoArea();
		double volume = cb.calcularVolume();
		
		System.out.println("Lado do cubo: "+cb.lado);
		System.out.println("Area do cubo: "+area);
		System.out.println("Volume do cubo: "+volume);
		
	}

}
