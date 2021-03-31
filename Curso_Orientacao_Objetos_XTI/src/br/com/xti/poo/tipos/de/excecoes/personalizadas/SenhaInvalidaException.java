package br.com.xti.poo.tipos.de.excecoes.personalizadas;

public class SenhaInvalidaException extends Exception {
	
	//Exception extends de Throwable que tem um método construtor que recebe uma mensagem em String
	
	public SenhaInvalidaException(String mensagem) {
		super(mensagem);
	}

}
