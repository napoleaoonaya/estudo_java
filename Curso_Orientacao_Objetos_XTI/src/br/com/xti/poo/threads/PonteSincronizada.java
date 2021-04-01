package br.com.xti.poo.threads;

public class PonteSincronizada implements Ponte {
	
	private int valor = -1;
	private boolean ocupada = false;

	@Override
	public synchronized void set(int valor) throws InterruptedException {
		
		while(ocupada) {
			System.out.println("Ponte cheia. Produtor deve aguardar!");
			//Esse método não pode ser executado enquanto a ponte estiver ocupada
			wait();
		}
		
		System.out.print("Produziu: "+valor);
		this.valor = valor;
		
		ocupada = true;
		
		//serve para indicar para todas Thread continuar a execução
		notifyAll();
	}

	@Override
	public synchronized int get() throws InterruptedException {
		//Executa quando a ponte não estiver ocupada
		while(!ocupada) {
			System.out.println("Ponte esta vazia. Consumidor aguardando!");
			wait();
		}
		
		System.err.print("Consumiu: "+valor);
		
		//Não esta mais ocupada
		ocupada = false;
		
		notifyAll();
		return valor;
	}

	
}
