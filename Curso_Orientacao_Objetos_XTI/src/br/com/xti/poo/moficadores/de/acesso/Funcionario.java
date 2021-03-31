package br.com.xti.poo.moficadores.de.acesso;

public class Funcionario {
	
	public String nome;
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.nome = "Napoleão Kazu Onaya";
		
		
	}
	
	public String getNome() {
		return nome;
	}

}
