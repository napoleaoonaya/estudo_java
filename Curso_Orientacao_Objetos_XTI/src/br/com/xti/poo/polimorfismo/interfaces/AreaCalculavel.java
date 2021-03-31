package br.com.xti.poo.polimorfismo.interfaces;

/**
 * Palavra chave interface
 * 
 * Dentro de uma interface s� pode declarar
 * m�todo abstract
 * 
 * Tem m�todos 100% abstratos
 * 
 * Toda interface quando implementada deve-se criar os m�todos abstratos
 * 
 * Permite compartilhar objetos de classes diferentes, podendo implementa-la em qualquer 
 * classe, a tipos diferentes
 * 
 * Unidade de programa��o fundamental java � a classe que colocamos o algoritmos
 * 
 * Projetos orientado a objetos � o tipo de dados
 * 
 * Interface express�o de projeto puro
 * 
 * Uma classe � uma mistura de projeto e implementa��o
 * 
 * Qualquer atributo sera sempre uma constante e public static final
 * 
 * @author napoleao.kazu.onaya
 *
 */

public interface AreaCalculavel {
	
	int X = 1;
	
	double calculoArea();

}
