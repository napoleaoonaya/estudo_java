package br.com.xti.poo.assertions;

import java.util.Scanner;

public class Assertions {
	
	public static void main(String[] args) {
		
		/**
		 * Recurso de teste em tempo de desenvolvimento
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero de 0 a 10: ");
		int numero = s.nextInt();
		
		//Forma comum
		//assert(numero>=0 && numero<=10);
		
		//Ligar assertion no prompt ( java -ea br.com.xti.poo.assertions.Assertions )
		//( java -enableassert br.com.xti.poo.assertions.Assertions )
		
		//Desabilitar assertion no prompt ( java -da br.com.xti.poo.assertions.Assertions )
		//( java -disableassert br.com.xti.poo.assertions.Assertions )
		
		//Ligar e Desabilitar ao mesmo templo
		//java -ea:br.com.xti.poo... -da:java.lang br.com.xti.erros.Teste
		
		
		assert(numero>=0 && numero<=10) : "N�mero invalido!";
		//Lan�ado um erro 
		
		//N�o devem ser tratadas dentro do programa
		
		//As assertions s�o usadas somente para teste em desenvolvimento
		
		System.out.println("Voc� entrou com: "+numero);
		
		//Para usar dentro da ide (Run Configurations - Arguments (VM Arguments - ea (apply)))
		
		
	}

}
