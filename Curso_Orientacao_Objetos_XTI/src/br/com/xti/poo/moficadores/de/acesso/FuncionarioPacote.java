package br.com.xti.poo.moficadores.de.acesso;

public class FuncionarioPacote {

	public static void main(String[] args) {
		
		//private não teria acesso
		//package tem acesso
		//public tem acesso
		Funcionario f = new Funcionario();
		f.nome = "Teste";
	
	}
}
