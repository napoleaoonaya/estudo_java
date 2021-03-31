package br.com.xti.poo.multi.catchs.stacktraces.throwss.exececoes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * Multi catch do java 7
 * 
 * Stack trace (pilha de erros por onde passou)
 * 
 * throws
 * 
 * @author napoleao.kazu.onaya
 *
 */

public class Erros {
	
	public static void dividir(Scanner s) throws InputMismatchException, ArithmeticException
	{
		
		System.out.println("Numero: ");
		int a = s.nextInt();

		System.out.println("Divisor: ");
		int b = s.nextInt();
		
		System.out.println("Resultado: "+(a/b));
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		boolean continua = true;
		
		do {
			try {
				
					dividir(s);
					
					//int x = 1 / 0;
				
					
					//java.util.InputMismatchException dividiu 
					//número por String
					
					//java.lang.ArithmeticException: / by zero
					//dividiu um número por zero
					
					continua = false;
				
				} 
				catch(InputMismatchException | ArithmeticException e1) {
					//System.err.println("String") saida de erro em vermelho
					System.err.println("O número é invalido: "+e1);
					//Imprime pilha de erro encontrado
					//e1.printStackTrace();
					//Capturar só o erro do stack trace (array)
					//e1.getStackTrace();
					//Mensagem de erro
					//e1.getMessage();
					s.nextLine();
				} 
				finally{
					System.out.println("Finally Executado...");
					
					/**
					 * Limpar conexão, limpar variaveis
					 */
					
					/**
					 * Sempre sera executado!!
					 */
				}

		}while(continua);
				
		
	}

}
