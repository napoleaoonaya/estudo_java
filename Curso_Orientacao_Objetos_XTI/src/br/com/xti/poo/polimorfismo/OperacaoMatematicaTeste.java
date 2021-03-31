package br.com.xti.poo.polimorfismo;

public class OperacaoMatematicaTeste {

	//Com polimorfismo
	//Passa como argumento a super classe e os atributos
	//A função espera receber uma nova classe e seus atributos
	public static void calcular(OperacaoMatematica operacaoMatematica, double x, double y) {
		System.out.println(operacaoMatematica.calcular(x, y));
	}
	
	//Sem polimorfismo não usar pois não segue orientação a objeto
	//Como substituir expressões condicionais por polimorfismo
	public static void calcular(String operacao, double x, double y) {
		if(operacao.equals("Soma")) {
			System.out.println((x + y));
		}else if(operacao.equals("Multiplicacao")) {
			System.out.println((x * y));
		}
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Com polimorfismo");
		calcular(new Soma(), 2, 4);
		calcular(new Multiplicacao(), 2,10);
		
		System.out.println("\n");
		
		System.out.println("Sem polimorfismo");
		calcular("Soma", 2, 3);
		calcular("Multiplicacao", 2, 3);

	}

}
