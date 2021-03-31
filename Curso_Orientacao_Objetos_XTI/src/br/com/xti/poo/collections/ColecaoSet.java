package br.com.xti.poo.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		//Aceita dados repetidos
		String[] cores = {
				"Verde",
				"Azul",
				"Amarelo",
				"Branco",
				"Azul",
				"Amarelo",
				"Branco"
		};
		
		//Aceita dados repetidos
		List<String> list = Arrays.asList(cores);
		
		System.out.println("Lista com List: "+list);
		
		
		//A interface Set só mantem os registros unicos, e os duplicados ela descarta
		
		Set<String> set = new HashSet<String>(list);

		System.out.println("Lista com Set: "+set);
		
	}

}
