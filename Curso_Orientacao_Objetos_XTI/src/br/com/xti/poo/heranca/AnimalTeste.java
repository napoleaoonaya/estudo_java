package br.com.xti.poo.heranca;

/**
 * Para usar a heran�a pergunte se a classe �-um (Cachorro �-um Animal)
 * 
 * exemplo:
 * 
 * Cachorro extends Animal true
 * Funcionario extends Pessoa true
 * Bebida extends Cerveja false a Cerveja � uma bebida, e n�o bebida � cerverja
 * 
 * Ganhos elimina c�digo duplicado, todas altera��es seram aplicadas a 
 * subclasses a alterarmos a superclasse, centraliza m�todos e atributos
 * 
 * @author napoleao.kazu.onaya
 *
 */

public class AnimalTeste {

	public static void main(String[] args) {
		
		System.out.println("Cachorro");
		
		Cachorro toto = new Cachorro();
		System.out.println(toto.comida="Bife");
		System.out.println(toto.peso=12);
		toto.domir();
		toto.fazerBarulho();
		
		System.out.println("\n");
		
		System.out.println("Galinha");
		
		Galinha gertrudes = new Galinha();
		gertrudes.domir();
		gertrudes.fazerBarulho();

	}

}
