package br.com.xti.poo.threads;

public class ContaConjunta {
	
	private int saldo = 190;
	
	public int getSaldo() {
		return saldo;
	}
	
// Se estar sincronizado da erro pois ambas as Treads estão concorrendo, gerando um saldo negativo	
//	public void sacar(int valor, String cliente) {
//		if(saldo >= valor) {
//			
//			//Saldo original
//			int saldoOriginal = saldo;
//			
//			System.out.println(cliente+" vai sacar ");
//			
//			//Aguardando o processamento
//			try {
//				System.out.println(cliente + " esperando ");
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//			saldo -= valor;
//			String msg = cliente + " Sacou "+ valor + "[Saldo Original = "
//					+ saldoOriginal +", Saldo Final = " + saldo + "]";
//			
//			System.out.println(msg);
//			
//		}else {
//			System.out.println("Saldo insuficiente para: "+cliente);
//		}
//		
//	}
	
	
	//Blocos sincronizados mantem as Threads, executa uma de cada vez, synchronized
	
	public synchronized void sacar(int valor, String cliente) {
		if(saldo >= valor) {
			
			//Saldo original
			int saldoOriginal = saldo;
			
			System.out.println(cliente+" vai sacar ");
			
			//Aguardando o processamento
			try {
				System.out.println(cliente + " esperando ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			saldo -= valor;
			String msg = cliente + " Sacou "+ valor + "[Saldo Original = "
					+ saldoOriginal +", Saldo Final = " + saldo + "]";
			
			System.out.println(msg);
			
		}else {
			System.out.println("Saldo insuficiente para: "+cliente);
		}
		
	}

}
