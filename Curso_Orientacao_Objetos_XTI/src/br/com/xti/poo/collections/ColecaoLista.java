package br.com.xti.poo.collections;

import java.util.ArrayList;
import java.util.List;

public class ColecaoLista {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();

		list.add("Futebol");
		list.add("Basquete");
		list.add("Volei");
		list.add("Natação");
		list.add("Karate");
		list.add("Futebol");
		
		//Essa interface List aceita elementos duplicados
		
		//A interface Set não aceita elementos duplicados
		
		System.out.println("Esportes: "+list);
		
		for(int i = 0; i < list.size(); i++) {
			String letra = list.get(i);
			list.set(i, letra.toUpperCase());
		}
		
		System.out.println("Esporte maiusculo: "+list);
		
		//método indexOf() localização da primeira ocorrencia
		System.out.println("Localize a primeira ocorrencia FUTEBOL:"+list.indexOf("FUTEBOL"));
		
		//método para retorno de sublista subList(0,2)
		System.out.println("Sublista de posição 0 e 2: "+list.subList(0, 2));
		
		
		//método de remoção de sublista 
		list.subList(0, 2).clear();
		System.out.println("Sublista removida da lista principal: "+list);
		
	}

}
