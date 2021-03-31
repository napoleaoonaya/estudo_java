package br.com.xti.poo.argumentos.variados;

public class ArgumentosVariadosTeste {

	public static void main(String[] args) {
		
		ArgumentosVariados argVariados = new ArgumentosVariados();
		
		//Forma de uso de argumento multiplos 
		double soma = argVariados.soma(1,2);
	
		System.out.println(soma);
		
		//Outra forma de usar uma fun��o com multiplos
		//argumentos
		double[] somas = {1,2,3,4,5,6};
		double resultado = argVariados.somaAlternativa(somas);
		
		System.out.println(resultado);
		
		double total = argVariados.soma("Soma de varios n�meros", 1,2);
		System.out.println(total);
		
	}

}
