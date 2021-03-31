package br.com.xti.poo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {
		
		//Criando um mapa
		Map<String, String> pais = new HashMap<String, String>();
		
		//Acionar elementos
		pais.put("BR", "Brasil");
		pais.put("RU", "Russia");
		pais.put("IN", "�ndia");
		pais.put("CH", "China");
		pais.put("JP", "Jap�o");
		
		System.out.println(pais);

		//Pesquisa se a chave existe
		System.out.println("Essa chave BR existe: "+pais.containsKey("BR"));
		
		//Se cont�m um determinado valor 
		System.out.println("Existe valor Brasil: "+pais.containsValue("Brasil"));
		
		//Qual o conte�do de uma chave
		System.out.println("Conte�de de uma chave: "+pais.get("CH"));
		
		//Remover um conte�do
		pais.remove("RU");
		
		System.out.println(pais);
		
		//Recuperar todas as chaves, s� que aten��o dados n�o podem estar duplicados!!, ele retorna um Set
		System.out.println("Recuperando todas as chaves: "+pais.keySet());
		
		System.out.println("\n");
		
		//Recuperando chave e valor
		Set<String> keys = pais.keySet();
		for (String key : keys) {
			System.out.println(key+ ":"+ pais.get(key));
		}
		
	}

}
