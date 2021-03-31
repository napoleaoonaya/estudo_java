package br.com.xti.poo.debugs;

public class DebugExemplo {
	
	static int resultado = 0;
	
	public int raiz(int numero) {
		int raiz = 0, impar = 1;
		while(numero >= impar) {
			numero -= impar;
			impar +=2;
			++raiz;
		}
		return raiz;
	}
	
	public static void main(String[] args) {
		
		int numero = 16;
		
		DebugExemplo exemplo = new DebugExemplo();
		
		resultado = exemplo.raiz(numero);
		
		if(resultado == 4) {
			System.out.println("Raiz correta!");
		}
		
	}

}
