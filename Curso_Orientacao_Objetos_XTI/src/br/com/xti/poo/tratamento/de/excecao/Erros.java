package br.com.xti.poo.tratamento.de.excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Erros {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		boolean continua = true;
		
		do {
			try {
					//int x = 1 / 0;
				
					System.out.println("Numero: ");
					int a = s.nextInt();
	
					System.out.println("Divisor: ");
					int b = s.nextInt();
					
					System.out.println("Resultado: "+(a/b));
					
					//java.util.InputMismatchException dividiu 
					//número por String
					
					//java.lang.ArithmeticException: / by zero
					//dividiu um número por zero
					
					continua = false;
				
				} 
				catch(InputMismatchException e1) {
					//System.err.println("String") saida de erro em vermelho
					System.err.println("O divisor não pode ser uma String: "+e1);
					s.nextLine();
				} 
				catch(ArithmeticException e2) {
					System.out.println("O divisor não pode ser zero: "+e2);
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
