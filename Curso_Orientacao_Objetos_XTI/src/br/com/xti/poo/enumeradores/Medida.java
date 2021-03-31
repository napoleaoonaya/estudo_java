package br.com.xti.poo.enumeradores;

public enum Medida {
	
	MM("milimetros"), CM("centimetros"), M("metros");
	
	public String titulo;
	
	Medida(String titulo){
		this.titulo = titulo;
	}

}
