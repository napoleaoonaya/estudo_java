package br.com.xti.poo.trabalho.com.strings;

public class StringOperacoes {

	public static void main(String[] args) {
		
		//Literal
		String s1 = "Napole�o Kazu Onaya";
		//Concatenando
		String s2 = s1 + " Run AnyWhere";
		//Usando o construtor
		String s3 = new String();
		String s4 = new String("Hello World");
		
		char[] array = {'a','b','c','d'};
		String s5 = new String(array);
		
		//Opera��es basicas
		
		//retorna tamanho de String, return tipo int
		int tamanho = s1.length();
		System.out.println("Tamanho: "+tamanho);
		
		//retorna valor do caracter em um determinada posi��o, return tipo char
		char caracter = s1.charAt(0);//0 - (lenght - 1)
		System.out.println("Caracter: "+caracter);
		
		//retorna a propria string, return tipo String
		String texto = s1.toString();
		System.out.println("Seu texto: "+texto);
		
		//retorna s� maiusculo,  return tipo String("ZXYZ")
		String maiusculo = s1.toUpperCase();
		System.out.println("Seu texto em mai�sculo: "+maiusculo);
		
		//retorna s� min�sculo,  return tipo String("zxyz")
		String minusculo = s1.toLowerCase();
		System.out.println("Seu texto em min�sculo: "+minusculo);
		
		//Localiza��es
		
		//retorno a posi��o da String, return tipo int
		int posicao1 = s4.indexOf("W");
		System.out.println("Posi��o inicial: "+posicao1);
		
		//retorno a posi��o da String, return tipo int
		int posicao2 = s4.lastIndexOf("d");
		System.out.println("Posi��o final: "+posicao2);
		
		//retorna se a String esta vazia, return tipo boolean
		boolean estaVazio = s4.isEmpty();
		System.out.println("Esta vazio: "+estaVazio);
		
		//Compara��o
		String texto1 = "XTI";
		String texto2 = "xti";
		
		//Compara o valor de duas String se s�o iguais, return tipo boolean
		boolean avaliacao = texto1.equals(texto2);
		System.out.println("Avalia��o texto 1 � igual a texto 2: "+avaliacao);
		
		// == � para comparar objetos
		// texto1 == "XTI";
		
		//Compara o valor de duas String se s�o iguais ignorando as escritas, 
		//s� considera o conte�do , return tipo boolean
		boolean avaliacao2 = texto1.equalsIgnoreCase(texto2);
		System.out.println("Avalia��o texto 1 � igual a texto 2: "+avaliacao2);
		
		//Se uma String come�a um determinado caracter ou um texto
		boolean avaliacao3 = texto1.startsWith("XTI");
		System.out.println("Texto come�a com XTI: "+avaliacao3);
		
		//Se uma String termina com um determinado caracter ou um texto
		boolean avaliacao4 = texto1.endsWith("F");
		System.out.println("Texto termina com I: "+avaliacao4);
		
		//Compara se a String � maior que outra, return int
		//Aten��o a String tem que sem do mesmo tipo e tamanho, n�o pode fazer a compara��o de XTI com xti
		int c = "amor".compareTo("bola");// -1 � menor
		int d = "bola".compareTo("amor");// +1 � maior
		int e = "bola".compareTo("bola");// 0 � igual
		int f = "XTI".compareTo("xti");// -32 diferentes
		System.out.println("amor � maior que bola: "+c);
		System.out.println("bola � maior que amor: "+d);
		System.out.println("bola � igual a bola: "+e);
		System.out.println("XTI � igual xti: "+f);
		
		//Podemos comparar numeros dentro de String
		int g = "123".compareTo("345");
		System.out.println("123 � igual a 345: "+g);
		
		//Se uma String esta dentro de outra
		// regionMatches( para ignorar o casesensitive usa-se o true, a omiss�o aceita o false ,
		// 'aonde inicia o texto', 'texto a ser procurado',
		// 'indice inicial do texto procurado', 'indice final do texto procurado')
		String so = "Olhe, olhe!";
		boolean o = so.regionMatches( 6, "Olhe", 0, 4);//se usar o true, retornara o true porque ele ignorou letra maiuscula e minuscula
		System.out.println(o);
		
		//Itera��o de dados
		
		//Pegar uma palavra dentro de uma String sabendo s� sua posi��o final
		String l = "O Brasil � Lindo";
		String sl = l.substring(11);
		System.out.println("Pegou a palavra sabendo s� sua posi��o final: "+sl);
		//Pegar um palavra dentro de uma String sabendo sua posic�o inicial e final
		String st = l.substring(2,8);
		System.out.println("Pegou uma palavra sabendo a posi��o inicial e final: "+st);
		
		//Modifica��o de String
		
		String gh = "Ol� Mundo! ";
		String tu = gh.concat(st);
		System.out.println("Concatena��o de Strings: "+tu);
		//Concatena��o Equivalente
		String hj = "Ol� Mundo! ";
		String lk = (hj +"Brasil ");
		System.out.println("Concatena��o equivalente: "+lk);
		
		//Trocar valor de caracter
		//Isso � muito util para troca , por .
		//Podemos usar tamb�m um regex no primeiro parametro
		String po = lk.replace("s", "z");
		System.out.println("Nome do pa�s com z: "+po);
		
		//Troca todos os valores
		String qw = lk.replaceAll(" ", "*");
		System.out.println("Tudo que tiver espa�o em branco recebe * : "+qw);
		
		//Troca s� um primeiro valor
		String aw = lk.replaceFirst("Brasil", "brasil");
		System.out.println("Troca Brasil para brasil : "+aw);
		
		//Limpa caracteres no inicio e fim, exceto no meio da String
		String hl = "    Espa�os   ".trim();
		System.out.println("Sua String: "+hl);
	}

}
