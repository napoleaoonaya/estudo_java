package br.com.xti.poo.variaveis.locais.global;

/**
 * Variaveis locais, globais (staticos ou de classe)
 * 
 * metodo estatico
 * 
 * @author napoleao.kazu.onaya
 *
 */

public class Galinha {
	
	//Variavel global com static, criada uma unica vez e pertence a classe!!
	public static int ovosDaGranja;
	
	public int ovos;
	
	//Esse método retorna sempre a quantidade de ovos incrementada
	//porém para usar temos sempre usar o objeto que fora instanciado
	//Galinha g1 = new Galinha();
	//g1.botar();
	//g1.botar();
	//public void botar() {
	//	this.ovos++;
	//}
	
	//Esse método abaixo para adicionarmos um ovo a galinha podemos
	//chamar o método varias vezes porque estamos somando o ovos na
	//instancia da galinha
	public Galinha botar() {
		this.ovos++;
		//Para usar o método statico, chamamos a classe e depois .metodo estatico
		Galinha.ovosDaGranja++;
		return this;
	}
	
	public static double mediaDeOvos(int galinhas) {
		//Não pode usar this dentro por que o mesmo representa uma instancia 
		//de um objeto
		
		//Aqui dentro podemos acessar diretamente a variavel statica sem precisar o 
		//nome da classe que pode ser omitido
		//return(ovosDaGranja/galinhas);
		
		return (Galinha.ovosDaGranja/galinhas);
		
	}
	
	//static para não criar varias referencias
	//final para nunca ser modificado


}
