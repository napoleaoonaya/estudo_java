package br.com.xti.poo.regexs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		String padrao = "JAVA";
		String texto = "JAVA";
		
		//Return verdadeiro ou falso se o padr�o ocorrer
		boolean b = texto.matches(padrao);
		System.out.println("JAVA � igual a JAVA: "+b);
		
		//Express�o regulares s�o sensiveis a mai�scula e min�scula
		boolean c = "Java".matches("java");
		System.out.println("Java n�o � igual a java: "+c);
		
		/**
		 * Modificadores
		 * 
		 * (?i),Ignora mai�scula e min�scula
		 * (?X),Coment�rios
		 * (?m),Multilinhas
		 * (?s),Dottal
		 * 
		 */
		
		boolean d = "Java".matches("(?im)java");
		System.out.println("Java n�o � igual a java: "+d);
		
		/**
		 * Metacaracter
		 * 
		 * . qualquer caracter
		 * \\d digitos [0-9]
		 * \\D n�o � d�gito [^0-9]
		 * \\s espa�os [ \t\n\x0B\f\r]
		 * \\S n�o � espa�o [^\s]
		 * \\w letra [a-zA-Z_0-9]
		 * \\W n�o � letra
		 * 
		 * 
		 */
		
		//@ � um caracter
		b = "@".matches(".");
		//2 � um n�mero
		b = "2".matches("\\d");
		//a � uma letra
		b = "a".matches("\\w");
		//espaco
		b = " ".matches("\\s");
		//dois ou mais caracteres
		b = "Pi".matches("..");
		//dois numeros
		b = "21".matches("\\d\\d");
		System.out.println(b);
		
		//Express�o regular para cep
		String cep = "\\d\\d\\d\\d\\d.\\d\\d\\d";
		c = "08225-250".matches(cep);
		System.out.println(c);
		
		/**
		 * Quantificadores
		 * 
		 * X{n} X, exatamente n vezes
		 * X{n,} X, pelo menos n vezes
		 * X{n,m} X, pelo menos n mas n�o mais do que m vezes
		 * X? X, 0 ou 1 vez 
		 * X* X, 0 ou + vezes
		 * X+ X, 1 ou + vezes
		 * 
		 * 
		 */
		
		//procura dois digitos
		b = "21".matches("\\d{2}");
		//procura pelo menos dois digitos
		b = "231".matches("\\d{2,}");
		//procuar pelo menos dois mais n�o pode passar de cinco
		b = "23415".matches("\\d{2,5}");
		//procurar um padr�o zero ou uma vez
		b = "".matches(".?");
		//quantificador asterico zero ou mais vezes
		b = "ab".matches(".*");
		//quantificador uma ou mais vezes
		b = "123".matches(".+");
		System.out.println(b);
		
		
		String cep2 = "\\d{5}-\\d{3}";
		boolean f = "08225-210".matches(cep2);
		System.out.println(f);
		
		String dataCalendario = "\\d{2}/\\d{2}/\\d{4}";
		boolean g = "29/03/2021".matches(dataCalendario);
		System.out.println(g);
		
		/**
		 * Meta  caracter de froteira
		 * 
		 */
		
		//Come�a com Pier
		b = "Pier21".matches("^Pier.*");
		//Termina com 21
		b = "Pier21".matches(".*21$");
		//Palavra no meio do texto
		b = "tem java la dentro".matches(".*java.*");
		//Inicia com tem e termina com aqui
		b = "tem java la dentro".matches("^tem.*dentro$");
		System.out.println(b);
		
		/**
		 * Meta caracter ou
		 */
		
		b = "sim".matches("sim|n�o");
		System.out.println(b);
		
		/**
		 * Agrupadores
		 * 
		 * [...] agrupamento
		 * [a-z] alcance
		 * [a-e][i-u] uni�o
		 * [a-z&&[aeiou]] intersec��o
		 * [^abc] exce��o
		 * [a-z&&[^m-p]] Subtra��o
		 * \x fuga de literal
		 * 
		 * 
		 */
		
		b = "sim".matches("[a-z]");
		System.out.println(b);
		
		b = "3".matches("[0-9]");
		System.out.println(b);
		
		b = "true".matches("[tT]rue");//true ou True
		System.out.println(b);
		
		b = "yes".matches("[tT]rue|[yY]es");//true ou True ou yes ou Yes
		System.out.println(b);
		
		b = "Napole�o".matches("[A-Z][a-zA-Z]*");//Primeiro nome letra maiuscula
		System.out.println(b);
		
		b = "olho".matches("[^abc]lho");
		System.out.println(b);
		
		b = "crau".matches("cr[ae]u");//crau ou creu
		System.out.println(b);
		
		//muito usado para e-mail
		b = "rh@xti.com.br".matches("\\w+@\\w+\\.\\w\\w{2,3}");
		System.out.println(b);
		
		//matches converte para algoritimo que valida texto em tempo de execu��o
		
		//compile prepara para depois usar varias vez
		
		//Muito usado
		//Voc� pode executar o compiler e chamar o matcher para adicionar ao group
		String doce = "Qual � o Doce mais doce que batata-DoCe";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		
		
		//Substitui��es
		String r = doce.replaceAll("(?i)doce", "docinho");
		System.out.println(r);
		
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX");
		System.out.println(r);
		
		r = "Tabular este texto".replaceAll("\\s", "\t");
		System.out.println(r);
		
		String url = "www.xti.com.br/clientes-2011.html";
		//http://www.xti.com.br/2021/clientes
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);
		System.out.println(b);
		
		//http://www.xti.com.br/2021/clientes
		
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		
		//Antes
		System.out.println(url);
		
		r = url.replaceAll(re,"http://$1/$3/$2.jsp");
		
		//Ap�s modifica��o
		System.out.println(r);
		
		//Pesquise livros regex
		
		
	}

}
