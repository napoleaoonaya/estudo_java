package br.com.xti.poo.threads;

public class PonteTesteNaoSincronizado {
	
	public static void main(String[] args) {
		
		Ponte ponte = new PonteNaoSincronizada();
		
		new Thread(new Produtor(ponte)).start();
		new Thread(new Consumidor(ponte)).start();
		
		
		
	}

}
