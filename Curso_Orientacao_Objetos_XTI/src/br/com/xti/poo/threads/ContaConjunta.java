package br.com.xti.poo.threads;

public class ContaConjunta {
	
	private int saldo = 90;
	
	public int getSaldo() {
		return saldo;
	}
	
	public void sacar(int valor, String cliente) {
		saldo -= valor;
	}

	
}
