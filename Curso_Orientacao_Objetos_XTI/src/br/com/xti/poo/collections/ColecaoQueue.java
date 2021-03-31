package br.com.xti.poo.collections;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		//Criando uma fila
		Queue<String> fila = new LinkedList<String>();

		//Adicionando dados a fila
		fila.add("Ricardo");
		fila.add("Napoleão");
		fila.add("Miguel");
		fila.add("Lucas");
		fila.add("Pedro");
		
		//Podemos usar para adicionar o add() e o offer()
		fila.offer("Daniel");
		fila.offer("Haroldo");
		
		//Filas representam processamentos
		//FIFO obedecem a firts in first out
		
		System.out.println("Fila: "+fila);
		
		//Como trabalhamos com uma fila 
		
		//Qual é a proximo elemento da fila
		System.out.println("Primeiro elemento da fila: "+fila.peek());
		
		//Remove o elemento que esta em primeiro lugar
		System.out.println("Remove o primeiro elemento: "+fila.poll());
		
		System.out.println(fila);
		
		
		//Acessar direto pela classe LinkedList
		LinkedList<String> f = (LinkedList<String>) fila;
		
		//Coloca no inicio da fila
		f.addFirst("Caio");
		
		//Coloca no fim da fila
		f.addLast("Miguel");
		
		System.out.println(f);
		
		//Primeira pessoa sem remover
		System.out.println("Removeu Caio: "+f.peekFirst());
		//Ultima pessoa sem remover
		System.out.println("Removeu Miguel: "+f.peekLast());
		
		System.out.println("Litas de nomes: "+fila);
		
		//Remover 
		f.poll();
		
		System.out.println(fila);
		
		//Remove o primeiro da fila
		f.pollFirst();
		
		System.out.println(fila);
		
		//Remove o ultimo da fila
		f.pollLast();
				
		System.out.println(fila);
		
	}

}
