package br.com.xti.poo.genericos;

import java.util.ArrayList;

public class Generico <E>{

	//Antigamente
//	Object elemento;
//	
//	public void setElemento(Object elemento) {
//		this.elemento = elemento;
//	}
//	
//	public Object getElemento() {
//		return elemento;
//	}
	
	//Hoje
	E elemento;
	
	public void setElemento(E elemento) {
		this.elemento = elemento;
	}

	public E getElemento() {
		return elemento;
	}	
	
	//Caracter coringa
//	public double soma(ArrayList<Number>lista) {
//	}
	
	//<? extends Number> pega os filhos e o pai de Number
	public double soma1(ArrayList<? extends Number>lista) {
		//Receber um ArrayList de double, float, Number
		double total = 0;
		for(Number number : lista) {
			total += number.doubleValue();
		}
		return total;
	}
	
	//<? super Number> pega somente o pai de Number
	public double soma2(ArrayList<? super Number>lista) {
		//Receber um ArrayList de double, float, Number
		double total = 0;
		//deu erro por ele não pode criar um objeto de Number
//		for(Number number : lista) {
//			total += number.doubleValue();
//		}
		return total;
	}
	
	public static void main(String[] args) {
		
		//Generico g = new Generico();
		
		//Aceita qualquer elemento
		//Outro problema é acessar o tipo de dados do objeto
		//g.setElemento("Lago Paranoá");
		//g.setElemento(12345678);
		
		//String e = (String) g.getElemento();
		//e.toUpperCase();
		
		//Falha com erro de excecução
		
		Generico<String> g = new Generico<>();
		g.setElemento("Lago paranoá");
		g.getElemento().toUpperCase();
		

	}

}
