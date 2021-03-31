package br.com.xti.poo.polimorfismo.interfaces;

public class InterfaceTeste {
	
	public static void area(AreaCalculavel o) {
		System.out.println(o.calculoArea());
	}
	
	public static void volume(VolumeCalculavel o) {
		System.out.println(o.calcularVolume());
	}
	
	public static void main(String[] args) {
		
		
		Quadrado qd = new Quadrado(2);
		AreaCalculavel a = qd;
		
		area(new Quadrado(2));
		volume(new Cubo(2));
		
	}

}
