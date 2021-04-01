package br.com.xti.poo.garbage.collector;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

	//M�todo que carrega valores na mem�ria
	public static long carregarMemoria() {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 100_000 ;i++) {
			list.add(i);
		}
		//Quanto de mem�ria livre
		return Runtime.getRuntime().freeMemory();
	}
	
	public static void main(String[] args) {
		
		//Como recuperar algo que j� esteve em execu��o
		Runtime rt = Runtime.getRuntime();
		
		
		int MB = 1_048_576;//total de bytes em 1MB
		
		//Retorna a quantidade total de memoria disponivel para jvm
		double total = rt.maxMemory()/MB;

		//Quanto de m�moria tinha no inicio
		double inicio = total - (carregarMemoria()/MB);
		
		System.out.println("Total: "+total);
		System.out.println("Inicio: "+inicio);
		
		//M�todos de limpeza 
		rt.runFinalization();
		
		//Chamar o m�todo gc()
		rt.gc();
		
		//Calcular total de mem�ria depois da limpeza
		double fim = total - (rt.freeMemory()/MB);
		
		System.out.println("No in�cio: "+ inicio + " No final: " + fim);
		
		//Aten��o cuide sempre da mem�ria utilizada nos programas!!
		
	}

}
