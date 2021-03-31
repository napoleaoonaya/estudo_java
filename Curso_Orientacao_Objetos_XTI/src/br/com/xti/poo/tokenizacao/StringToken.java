package br.com.xti.poo.tokenizacao;

public class StringToken {

	public static void main(String[] args) {
		
		//Tokens
		String s2 = "XHTML; CSS; JavaScript; JQuery; Java";
		
		//Métodos split recebe uma expressão regular
		String[] tokens = s2.split(";");
		System.out.println(tokens.length+" tokens");
		
		//Percorrendo o array para pegar cada token
		for (String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println("\n");
		
		String s3 = "Venha Trabalhar na XTI";
		String[] tokens2 = s3.split(" ");
		System.out.println("Temos: "+tokens2.length+" tokens");
		
		for(String t1 : tokens2) {
			System.out.println(t1);
		}
		
		//O delimitador pode ser qualquer coisa!!
		
	}
}
