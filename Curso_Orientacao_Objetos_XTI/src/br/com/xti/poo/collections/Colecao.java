package br.com.xti.poo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {
	
	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		
		//método add, para adicionar
		c.add("A");
		c.add("C");
		c.add("D");
		
		//método toString() para exibir valores da Collection
		System.out.println("Valores da Collection: "+c.toString());
		
		//método isEmpty() para ver se os valores da Collection estão vazios
		System.out.println("Esta vazio: "+c.isEmpty());
		
		//método contains() pesquisa valores
		System.out.println("Contem a letra A: "+c.contains("A"));
		
		//método para remover elementos
		System.out.println("Removendo A: "+c.remove("A"));
		System.out.println("Valores da Collection após a remoção de A: "+c.toString());
		
		//Trabalhar com grupos
		
		//Converter uma Collecao em ArrayList, usamos a Arrays.asList()
		
		Collection<String> c2 = Arrays.asList("O","U");
		//método addAll() adiciona um segundo elemento na primeira lista
		c.addAll(c2);
		System.out.println("Valores da primeira Collection c1 mais a segunda Collection c2: "+c.toString());
		
		//método containsAll() verifica se contém todos os elementos
		System.out.println("Contém elementos na Collection c1 e Collection c2: "+c.containsAll(c2));
		
		//método para remover todos elementos removeAll() de uma Collection
		c.removeAll(c2);
		System.out.println("Remover elementos da Collenction c2: "+c.toString());
		
		//Como percorrer uma Collection
		for(String elementos : c) {
			System.out.print(elementos);
		}
		
		System.out.println("\n");
		
		//Coverter a Collection para um Array
		String[] s = c.toArray(new String[c.size()]);
		System.out.println(Arrays.toString(s)+"\n");
		
		//método clear() limpa toda a coleção
		c.clear();
		System.out.println("Limpou a Collection: "+c.toString());
		
		
		
	}

}
