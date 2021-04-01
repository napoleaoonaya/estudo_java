package br.com.xti.poo.threads;

public interface Ponte {
	
	//Para definir informação compartilhada
	public void set(int valor) throws InterruptedException;
	//Para recuperar informação
	public int get() throws InterruptedException;

}
