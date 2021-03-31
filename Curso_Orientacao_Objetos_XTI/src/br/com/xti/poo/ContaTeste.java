package br.com.xti.poo;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		
		conta.setCliente("Napoleão Kazu Onaya");
		conta.setSaldo(7_000.00);
		System.out.println("Conta aberta com: ");
		conta.exibeSaldo();
//		
//		conta.saca(200.00);
//		conta.exibeSaldo();
//		
//		conta.deposita(100.00);
//		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.setCliente("Miguel Batatinha Junior");
		destino.setSaldo(1_000.00);
		
		System.out.println("Conta aberta com: ");
		destino.exibeSaldo();
		
		conta.tranferePara(destino, 1200.00);
		
		System.out.println("Contas após a transferência");

		conta.exibeSaldo();
		
		destino.exibeSaldo();

	}

}
