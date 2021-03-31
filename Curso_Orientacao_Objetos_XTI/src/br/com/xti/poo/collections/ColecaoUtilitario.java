package br.com.xti.poo.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Guaran�");
		list.add("Manga");
		list.add("Goiaba");
		list.add("A�ai");
		list.add("Abacaxi");
		list.add("Graviola");
		list.add("Uva");
		list.add("Pera");
		list.add("Ma��");
		
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
		Collections.addAll(list, "Cupua�u", "Laranja", "Ameixa", "Laranja");
		
		System.out.println("Adicionado a lista Cupua�u - Laranja - Ameixa: "+list);
		
		//Quantas vezes aparece um dado
		System.out.println("Quantas vezes aparece Laranja: "+Collections.frequency(list, "Laranja"));
		
		//Criando uma lista secund�ria
		List<String> list2 = Arrays.asList("Acerola","Mel�o");
		
		//Verificando se na primeira lista tem os elementos da segunda lista
		boolean resultado = Collections.disjoint(list, list2);
		
		System.out.println("Na primeira lista tem os elementos da segunda lista: "+resultado);
		
		//Ordena a lista
		Collections.sort(list);
		//Pesquisa na lista se tem o Valor Guaran�
		int posicao = Collections.binarySearch(list, "Guaran�");
		//Devolve a posi��o do index do Guaran�
		System.out.println("Posi��o do Guaran�: "+posicao);
		//Exibe a lista
		System.out.println("Lista j� ordenada: "+list);
		
		//Preenche todas posi��es com um dado
		Collections.fill(list, "BR");
		System.out.println("Nova Lista: "+list);
		
		//Criar uma Collections que n�o pode ser modificada
		Collection<String> constantes = Collections.unmodifiableCollection(list);
		System.out.println(constantes);
		
		//Vai dar erro de UnsupportedOperation
		//constantes.add("TESTE");
		//System.out.println(constantes);
		
	}

}
