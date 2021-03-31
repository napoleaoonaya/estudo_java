package br.com.xti.poo.trabalho.com.strings;

public class StringOperacoes {

	public static void main(String[] args) {
		
		//Literal
		String s1 = "Napoleão Kazu Onaya";
		//Concatenando
		String s2 = s1 + " Run AnyWhere";
		//Usando o construtor
		String s3 = new String();
		String s4 = new String("Hello World");
		
		char[] array = {'a','b','c','d'};
		String s5 = new String(array);
		
		//Operações basicas
		
		//retorna tamanho de String, return tipo int
		int tamanho = s1.length();
		System.out.println("Tamanho: "+tamanho);
		
		//retorna valor do caracter em um determinada posição, return tipo char
		char caracter = s1.charAt(0);//0 - (lenght - 1)
		System.out.println("Caracter: "+caracter);
		
		//retorna a propria string, return tipo String
		String texto = s1.toString();
		System.out.println("Seu texto: "+texto);
		
		//retorna só maiusculo,  return tipo String("ZXYZ")
		String maiusculo = s1.toUpperCase();
		System.out.println("Seu texto em maiúsculo: "+maiusculo);
		
		//retorna só minúsculo,  return tipo String("zxyz")
		String minusculo = s1.toLowerCase();
		System.out.println("Seu texto em minúsculo: "+minusculo);
		
		//Localizações
		
		//retorno a posição da String, return tipo int
		int posicao1 = s4.indexOf("W");
		System.out.println("Posição inicial: "+posicao1);
		
		//retorno a posição da String, return tipo int
		int posicao2 = s4.lastIndexOf("d");
		System.out.println("Posição final: "+posicao2);
		
		//retorna se a String esta vazia, return tipo boolean
		boolean estaVazio = s4.isEmpty();
		System.out.println("Esta vazio: "+estaVazio);
		
		//Comparação
		String texto1 = "XTI";
		String texto2 = "xti";
		
		//Compara o valor de duas String se são iguais, return tipo boolean
		boolean avaliacao = texto1.equals(texto2);
		System.out.println("Avaliação texto 1 é igual a texto 2: "+avaliacao);
		
		// == é para comparar objetos
		// texto1 == "XTI";
		
		//Compara o valor de duas String se são iguais ignorando as escritas, 
		//só considera o conteúdo , return tipo boolean
		boolean avaliacao2 = texto1.equalsIgnoreCase(texto2);
		System.out.println("Avaliação texto 1 é igual a texto 2: "+avaliacao2);
		
		//Se uma String começa um determinado caracter ou um texto
		boolean avaliacao3 = texto1.startsWith("XTI");
		System.out.println("Texto começa com XTI: "+avaliacao3);
		
		//Se uma String termina com um determinado caracter ou um texto
		boolean avaliacao4 = texto1.endsWith("F");
		System.out.println("Texto termina com I: "+avaliacao4);
		
		//Compara se a String é maior que outra, return int
		//Atenção a String tem que sem do mesmo tipo e tamanho, não pode fazer a comparação de XTI com xti
		int c = "amor".compareTo("bola");// -1 é menor
		int d = "bola".compareTo("amor");// +1 é maior
		int e = "bola".compareTo("bola");// 0 é igual
		int f = "XTI".compareTo("xti");// -32 diferentes
		System.out.println("amor é maior que bola: "+c);
		System.out.println("bola é maior que amor: "+d);
		System.out.println("bola é igual a bola: "+e);
		System.out.println("XTI é igual xti: "+f);
		
		//Podemos comparar numeros dentro de String
		int g = "123".compareTo("345");
		System.out.println("123 é igual a 345: "+g);
		
		//Se uma String esta dentro de outra
		// regionMatches( para ignorar o casesensitive usa-se o true, a omissão aceita o false ,
		// 'aonde inicia o texto', 'texto a ser procurado',
		// 'indice inicial do texto procurado', 'indice final do texto procurado')
		String so = "Olhe, olhe!";
		boolean o = so.regionMatches( 6, "Olhe", 0, 4);//se usar o true, retornara o true porque ele ignorou letra maiuscula e minuscula
		System.out.println(o);
		
		//Iteração de dados
		
		//Pegar uma palavra dentro de uma String sabendo só sua posição final
		String l = "O Brasil é Lindo";
		String sl = l.substring(11);
		System.out.println("Pegou a palavra sabendo só sua posição final: "+sl);
		//Pegar um palavra dentro de uma String sabendo sua posicão inicial e final
		String st = l.substring(2,8);
		System.out.println("Pegou uma palavra sabendo a posição inicial e final: "+st);
		
		//Modificação de String
		
		String gh = "Olá Mundo! ";
		String tu = gh.concat(st);
		System.out.println("Concatenação de Strings: "+tu);
		//Concatenação Equivalente
		String hj = "Olá Mundo! ";
		String lk = (hj +"Brasil ");
		System.out.println("Concatenação equivalente: "+lk);
		
		//Trocar valor de caracter
		//Isso é muito util para troca , por .
		//Podemos usar também um regex no primeiro parametro
		String po = lk.replace("s", "z");
		System.out.println("Nome do país com z: "+po);
		
		//Troca todos os valores
		String qw = lk.replaceAll(" ", "*");
		System.out.println("Tudo que tiver espaço em branco recebe * : "+qw);
		
		//Troca só um primeiro valor
		String aw = lk.replaceFirst("Brasil", "brasil");
		System.out.println("Troca Brasil para brasil : "+aw);
		
		//Limpa caracteres no inicio e fim, exceto no meio da String
		String hl = "    Espaços   ".trim();
		System.out.println("Sua String: "+hl);
	}

}
