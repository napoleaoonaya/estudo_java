package br.com.xti.poo.heranca.topico.avancado;

/**
 * Para usar a herança pergunte se a classe é-um (Cachorro é-um Animal)
 * 
 * exemplo:
 * 
 * Cachorro extends Animal true
 * Funcionario extends Pessoa true
 * Bebida extends Cerveja false a Cerveja é uma bebida, e não bebida é cerverja
 * 
 * Ganhos elimina código duplicado, todas alterações seram aplicadas a 
 * subclasses a alterarmos a superclasse, centraliza métodos e atributos
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
		
		System.out.println("\n");
		
		//Toto é um cachorro
		System.out.println("É um cachorro: "+(toto instanceof Cachorro));
		//Toto é um animal
		System.out.println("É um animal: "+(toto instanceof Animal));

		//Toto não é uma Galinha
		//System.out.println("É um cachorro: "+(toto instanceof Galinha));
		
		/**
		 * Todas as classes extends de Object
		 * 
		 */
		
		//Compara dois objetos
		System.out.println(toto.equals(gertrudes));
		//Gera um código identificador da classe
		System.out.println(toto.hashCode());
		//Retorna o nome da classe eo pacote do objeto
		System.out.println(toto.getClass());
		//Retorna somente o caminho completo do pacote
		System.out.println(toto.toString());
	}

}
