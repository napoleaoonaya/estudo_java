package br.com.xti.poo.variaveis.locais.global;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		Galinha cocorico = new Galinha();
		
		//Para o primeiro método
//		cocorico.botar();
//		cocorico.botar();
//		cocorico.botar();
		
		//Para o método que chama a instancia da Galinha retornando sempre a 
		//mesma com this;
		cocorico.botar().botar().botar();
		
		Galinha gerturdes = new Galinha();
		
		gerturdes.botar().botar().botar().botar();
		
		System.out.println("Ovos da cocorico: "+cocorico.ovos);
		System.out.println("Ovos da gertudes: "+gerturdes.ovos);
		//Acesso direto na classe sem usar new
		System.out.println("Total de ovos na granja: "+Galinha.ovosDaGranja);
		System.out.println("Média de ovos por quantidade de galinha: "+Galinha.mediaDeOvos(2));

	}

}
