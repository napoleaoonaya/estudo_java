package br.com.xti.poo.stringbufers.stringbuilders;

public class StringMutavel {
	
	public static void main(String[] args) {
		
		StringBuffer sbuf = new StringBuffer(); //Sincronizados, para varias threds
		StringBuilder sbui = new StringBuilder("Java"); //Assincrono
		
		//Podem ser criadas já com um valor
//		StringBuffer sbf = new StringBuffer("Texto");
//		StringBuilder sbi = new StringBuilder("Texto2"); 
		
		//Possuem os métodos
		sbui.toString();
		sbui.length();
		
		System.out.println("Tamanho da StringBuilder: ");
		System.out.println(sbui.length());
		
		System.out.println("\n");
		
		//Esse método não exite para String
		//Mede a capacidade de inclusão
		sbui.capacity();
		
		System.out.println("Capacidade de armazenamento na StringBuilder: ");
		System.out.println(sbui.capacity());
		
		System.out.println("\n");
		
		//Método reverse inverte a ordem de caracteres
		System.out.println("Inverte a ordem dos caracteres: ");
		System.out.println(sbui);
		System.out.println(sbui.reverse());
		
		System.out.println("\n");
		
		//Adiciona valores
		sbui.append(" Trabalhando com StringBuilder e StringBuffer!: ");
		//Pode adicionar cadeia de caracteres, variaveis, etc.
		char[] c = {'c','d','a','b','u'};
		//Pode usar varios append
		sbui.append(c).append(" teste");
		System.out.println("Usando o append: ");
		System.out.println(sbui);
		System.out.println("\n");
		
		//Essa primeira criação de objeto com concatenação, cria varios objetos em memória
		String s = "Oi"+ " como "+ " vai "+" você";
		System.out.println(s);
		//Essa segunda criação de objeto, cria somente um objeto em memória
		String sb = new StringBuilder("Oi").append(" como ").append(" vai você").toString();
		System.out.println(sb);
		
		System.out.println("\n");
		
		//toString() transforma em String
		
		//delete(start,end)
		
		//Remover conteudos dos textos
		String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
		System.out.println(url);
	}

}
