package br.com.xti.poo.moficadores.de.acesso;

public class FuncionarioPacote {

	public static void main(String[] args) {
		
		//private n�o teria acesso
		//package tem acesso
		//public tem acesso
		Funcionario f = new Funcionario();
		f.nome = "Teste";
	
	}
}
