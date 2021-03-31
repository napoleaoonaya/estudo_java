package br.com.xti.poo.sobrecarga.metodos;

/**
 * Sobrecarga de métodos
 * 
 * Podemos ter métodos com mesmo nome porém com 
 * assinaturas diferentes
 * 
 * @author napoleao.kazu.onaya
 *
 */

public class MetodoSobrecarregado {
	
	double media(int x, int y) {
		System.out.print("media(int x, int y) = ");
		return ((x+y)/2);
	}
	
	double media(String x, String y) {
		System.out.print("media(String x, String y) = ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return ((ix+iy)/2);
	}
	
	double media(int x) {
		System.out.print("media(int x) = ");
		return x;
	}

	double media(int ... numeros) {
		System.out.print("media(int ... x) = ");
		return this.soma(numeros)/numeros.length;
	}
	
	double soma(int ... numeros) {
		double total = 0;
		for (int i : numeros) {
			total += i;
		}
		return total;
	}
}
