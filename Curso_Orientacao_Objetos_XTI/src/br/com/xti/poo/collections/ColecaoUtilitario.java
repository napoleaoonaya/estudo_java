package br.com.xti.poo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Guaraná");
		list.add("Manga");
		list.add("Goiaba");
		list.add("Açai");
		list.add("Abacaxi");
		list.add("Graviola");
		list.add("Uva");
		list.add("Pera");
		list.add("Maçã");
		
		System.out.println("Lista sem esta ordenada: "+list);

		//Ordena a Lista em ordem alfabetica
		Collections.sort(list);
		
		System.out.println("Lista ordenada: "+list);
		
		//Ordena a Lista em ordem reversa
		Collections.reverse(list);
		
		System.out.println("Lista reversa: "+list);
		
		//Embaralha os dados da Lista
		Collections.shuffle(list);
		
		System.out.println("Lista embaralhada: "+list);
		
		//Adicionar outros elementos na Lista
		Collections.addAll(list, "Cupuaçu", "Laranja", "Ameixa", "Laranja");
		
		System.out.println("Adicionado a lista Cupuaçu - Laranja - Ameixa: "+list);
		
		//Quantas vezes aparece um dado
		System.out.println("Quantas vezes aparece Laranja: "+Collections.frequency(list, "Laranja"));
		
		//Criando uma lista secundária
		List<String> list2 = Arrays.asList("Acerola","Melão");
		
		//Verificando se na primeira lista tem os elementos da segunda lista
		boolean resultado = Collections.disjoint(list, list2);
		
		System.out.println("Na primeira lista tem os elementos da segunda lista: "+resultado);
		
		//Ordena a lista
		Collections.sort(list);
		//Pesquisa na lista se tem o Valor Guaraná
		int posicao = Collections.binarySearch(list, "Guaraná");
		//Devolve a posição do index do Guaraná
		System.out.println("Posição do Guaraná: "+posicao);
		//Exibe a lista
		System.out.println("Lista já ordenada: "+list);
		
		//Preenche todas posições com um dado
		Collections.fill(list, "BR");
		System.out.println("Nova Lista: "+list);
		
		//Criar uma Collections que não pode ser modificada
		Collection<String> constantes = Collections.unmodifiableCollection(list);
		System.out.println(constantes);
		
		//Vai dar erro de UnsupportedOperation
		//constantes.add("TESTE");
		//System.out.println(constantes);
		
	}

}
