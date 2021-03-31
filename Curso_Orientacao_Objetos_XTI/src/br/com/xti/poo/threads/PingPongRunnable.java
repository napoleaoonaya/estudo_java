package br.com.xti.poo.threads;

public class PingPongRunnable implements Runnable {

	String palavra;
	long tempo;

	public PingPongRunnable(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}

	// Definindo o método run
	// Método run é executado pela virtual machine
	public void run() {

		try {

			for (int i = 0; i < 100; i++) {
				System.out.print(palavra + " ");

				// Colaca a Thread para dormir
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			return;
		}
	}

	public static void main(String[] args) {

		// System.out.println("Ver Thread");

		
		//Usando a Interface Runnable
		
		
		Runnable ping = new PingPongRunnable("ping", 1500);
		Runnable pong = new PingPongRunnable("pong", 1200);
		
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start();
		
		System.out.println("Ver Threads");

	}

}
