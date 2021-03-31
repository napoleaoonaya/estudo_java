package br.com.xti;

import br.com.xti.poo.moficadores.de.acesso.Funcionario;

public class FuncionarioExterno {
	
	public static void main(String[] args) {
		
		//private não tem acesso
		//packege não tem acesso
		//public tem acesso 
		Funcionario f = new Funcionario();
		f.nome = "teste";
	}

}
