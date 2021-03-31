package br.com.xti.poo.argumentos.variados;

import java.util.Iterator;

/**
 * Argumentos variaveis 
 * 
 * @author napoleao.kazu.onaya
 *
 */

public class ArgumentosVariados {
	
	//Usa-se os ... para criar um argumento variavel
	//de numeros indefinidos de argumentos,adicionados
	//numa lista
	//
	// ... converte para array
	//
	//Podemos percorrer usando um foreach
	public double soma(double ... numeros) {
		
		double total = 0;
		
		for (double n : numeros) {
			total += n;
		}
		return total;
	}
	
	//Outra forma de usar função de multiplos argumentos
	//com um array
	public double somaAlternativa(double[] numeros) {
		double total = 0;
		for(double n : numeros) {
			total += n;
		}
		return total;
	}
	
	public double soma(String titulo, double ... numeros) {
		System.out.println(titulo);
		double total = 0;
		for(double n : numeros) {
			total += n;
		}
		return total;
	}
	
}
