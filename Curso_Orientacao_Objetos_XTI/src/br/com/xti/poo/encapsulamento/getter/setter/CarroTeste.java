package br.com.xti.poo.encapsulamento.getter.setter;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro uno = new Carro();
		
		uno.setModelo("2021 - Novo");
		uno.setCor("Azul bebe");
		uno.setAno("2021");
		uno.setValor(10_000.00);
		
		System.out.println("Modelo: "+uno.getModelo());
		System.out.println("Ano: "+uno.getAno());
		System.out.println("Cor: "+uno.getCor());
		System.out.println("Valor: "+uno.getValor());
		
	}
}
