package br.com.xti.poo.multi.catchs.stacktraces.throwss.exececoes;

import br.com.xti.poo.polimorfismo.Galinha;
import br.com.xti.poo.polimorfismo.Animal;
import br.com.xti.poo.polimorfismo.Cachorro;

public class ExcecoesComuns {

	static int[] arrayNullo;
	
	static int[] arrayComZeroPosicao = new int[0];
	
	public static void main(String[] args) {
		
		//NullPointerException acessou a variavel sem definir um valor
		//System.out.println(arrayNullo.length);
		
		//ArithmeticException erro matem�tico
		//int x = 5/0;
		
		//ArrayIndexOutOfBoundsException posi��o inexistente
		//System.out.println(arrayComZeroPosicao[1]);
		
		//ClassCastException a Galinha n�o � um Cachorro
		//convers�o de tipos de forma explicita 
		//Animal a = new Galinha();
		//Cachorro c = (Cachorro) a;
		
		//NumberFormatException
		//n�o consegue transformar uma string em texto
		int inteiro = Integer.parseInt("xti");
		
	}
}
 