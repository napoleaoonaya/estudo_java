package br.com.xti.poo.threads;

public class PingPong extends Thread {

	String palavra;
	long tempo;

	public PingPong(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}

	// Definindo o método run
	// Método run é executado pela virtual machine
	public void run() {

		try {

			for (int i = 0; i < 5; i++) {
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

		Thread t = new Thread();

		// Executando a Thread
		new PingPong("ping", 1500).start();
		new PingPong("pong", 1200).start();

	}

}
