package br.com.xti.poo.polimorfismo.metodo.abstrato;

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
	
	//Com polimorfismo
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	//Sem polimorfismo
	public static void barulhos(String animal) {
		if(animal.equals("Cachorro")) {
			System.out.println("Au Au Sem polimorfismo");
		} 
		if(animal.equals("Galinha")) {
			System.out.println("Co Co Sem polimorfismo");
		}
	}

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
		
		System.out.println("\n");
		
		//Toto � um cachorro
		System.out.println("� um cachorro: "+(toto instanceof Cachorro));
		//Toto � um animal
		System.out.println("� um animal: "+(toto instanceof Animal));

		//Toto n�o � uma Galinha
		//System.out.println("� um cachorro: "+(toto instanceof Galinha));
		
		/**
		 * Todas as classes extends de Object
		 * 
		 */
		
		//Compara dois objetos
		System.out.println(toto.equals(gertrudes));
		//Gera um c�digo identificador da classe
		System.out.println(toto.hashCode());
		//Retorna o nome da classe eo pacote do objeto
		System.out.println(toto.getClass());
		//Retorna somente o caminho completo do pacote
		System.out.println(toto.toString());
		
		System.out.println("\n");
		
		//Animal generico
//		Animal generico = new Animal(50, "Carne e Legumes");
//		generico.fazerBarulho();
		
		System.out.println("\n");
		
		//Polimorfismo
		barulho(gertrudes);
		
		System.out.println("\n");
		
		//Sem polimorfismo
		barulhos("Cachorro");
		barulhos("Galinha");
		
		System.out.println("\n");
		
		toto.fazerBarulhoAbstrato();
		gertrudes.fazerBarulhoAbstrato();
	}

}
