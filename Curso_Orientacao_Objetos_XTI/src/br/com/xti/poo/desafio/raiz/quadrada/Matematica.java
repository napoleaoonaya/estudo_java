package br.com.xti.poo.desafio.raiz.quadrada;

public class Matematica {
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois numeros
	 */
	int maior (int um, int dois) {
		
		if(um > dois) {
			return um;
		}else {
			return dois;
		}
	}
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return a soma de dois numeros
	 */
	double soma (double um, double dois) {
		//return um + dois;
		double resultado = um + dois;
		return resultado;
	}
	
	int raiz (int numero) {
		
		int ciclos = 0; //definindo uma variavel para o ciclo
		int impar = 1;
		
		while(numero >= impar) {
			numero -= impar;
			impar +=2;//soma-se 2 para pegar sempre o próximo impar
			++ciclos;
		}
		
		return ciclos;
	}

}
