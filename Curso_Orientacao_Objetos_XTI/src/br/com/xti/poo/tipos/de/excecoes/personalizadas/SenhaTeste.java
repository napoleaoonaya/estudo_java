package br.com.xti.poo.tipos.de.excecoes.personalizadas;

public class SenhaTeste {

	static void autenticar(String senha) throws SenhaInvalidaException {
		if("123".equals(senha)) {
			System.out.println("autenticado");
		}else {
			System.out.println("senha incorreta");
			throw new SenhaInvalidaException(senha);
		}
	}
	
	public static void main(String[] args) {
		
		try {
			
			autenticar("1234");
			
		} catch (SenhaInvalidaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
