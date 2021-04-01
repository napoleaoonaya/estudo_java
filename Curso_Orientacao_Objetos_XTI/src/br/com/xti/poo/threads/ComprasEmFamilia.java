package br.com.xti.poo.threads;

public class ComprasEmFamilia implements Runnable {

	ContaConjunta conta = new ContaConjunta();
	
	
	
	public static void main(String[] args) {
		
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		
		//Abrir varias Tread ao mesmo tempo	
		new Thread(irAsCompras, "Pai").start();
		new Thread(irAsCompras, "M�e").start();
		new Thread(irAsCompras, "Filha").start();
		new Thread(irAsCompras, "Bab�").start();
		
	}

	@Override
	public void run() {
		
		//Pegar o nome da Thread corrente
		String cliente =  Thread.currentThread().getName();
		
		for(int i = 0 ; i<5; i++) {
			conta.sacar(20, cliente);
			
			if(conta.getSaldo() < 0) {
				System.out.println("Estourou");
			}
		}
		
	}

}
