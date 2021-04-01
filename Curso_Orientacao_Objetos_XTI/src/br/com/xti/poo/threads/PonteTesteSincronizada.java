package br.com.xti.poo.threads;

public class PonteTesteSincronizada {

	public static void main(String[] args) {
		
		Ponte ponte = new PonteSincronizada();
		
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();

	}

}
