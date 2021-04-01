package br.com.xti.poo.garbage.collector;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

	//Método que carrega valores na memória
	public static long carregarMemoria() {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 100_000 ;i++) {
			list.add(i);
		}
		//Quanto de memória livre
		return Runtime.getRuntime().freeMemory();
	}
	
	public static void main(String[] args) {
		
		//Como recuperar algo que já esteve em execução
		Runtime rt = Runtime.getRuntime();
		
		
		int MB = 1_048_576;//total de bytes em 1MB
		
		//Retorna a quantidade total de memoria disponivel para jvm
		double total = rt.maxMemory()/MB;

		//Quanto de mémoria tinha no inicio
		double inicio = total - (carregarMemoria()/MB);
		
		System.out.println("Total: "+total);
		System.out.println("Inicio: "+inicio);
		
		//Métodos de limpeza 
		rt.runFinalization();
		
		//Chamar o método gc()
		rt.gc();
		
		//Calcular total de memória depois da limpeza
		double fim = total - (rt.freeMemory()/MB);
		
		System.out.println("No início: "+ inicio + " No final: " + fim);
		
		//Atenção cuide sempre da memória utilizada nos programas!!
		
	}

}
