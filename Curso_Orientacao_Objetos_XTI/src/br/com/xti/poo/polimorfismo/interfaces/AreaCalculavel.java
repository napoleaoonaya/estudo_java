package br.com.xti.poo.polimorfismo.interfaces;

/**
 * Palavra chave interface
 * 
 * Dentro de uma interface só pode declarar
 * método abstract
 * 
 * Tem métodos 100% abstratos
 * 
 * Toda interface quando implementada deve-se criar os métodos abstratos
 * 
 * Permite compartilhar objetos de classes diferentes, podendo implementa-la em qualquer 
 * classe, a tipos diferentes
 * 
 * Unidade de programação fundamental java é a classe que colocamos o algoritmos
 * 
 * Projetos orientado a objetos é o tipo de dados
 * 
 * Interface expressão de projeto puro
 * 
 * Uma classe é uma mistura de projeto e implementação
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
