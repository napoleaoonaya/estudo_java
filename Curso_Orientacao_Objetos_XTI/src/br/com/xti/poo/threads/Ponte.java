package br.com.xti.poo.threads;

public interface Ponte {
	
	//Para definir informa��o compartilhada
	public void set(int valor) throws InterruptedException;
	//Para recuperar informa��o
	public int get() throws InterruptedException;

}
