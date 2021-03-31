package br.com.xti.poo.internacionalizacao.numeros;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) throws ParseException {
		
		double saldo = 123456.789;
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.format(saldo));
		
		nf = NumberFormat.getIntegerInstance();
		System.out.println(nf.format(saldo));
		
		nf = NumberFormat.getPercentInstance();
		System.out.println(nf.format(saldo));
		
		nf.setMaximumFractionDigits(1);
		nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(saldo));
		
		//Internacionalizar
		
		Locale brasil = new Locale("pt","BR");
		nf = NumberFormat.getCurrencyInstance(brasil);
		System.out.println(nf.format(saldo));
		
		Locale franca = new Locale("fr","FR");
		nf = NumberFormat.getCurrencyInstance(franca);
		System.out.println(nf.format(saldo));
		
		Locale japao = new Locale("jp","JP");
		nf = NumberFormat.getCurrencyInstance(japao);
		System.out.println(nf.format(saldo));
		
		nf = NumberFormat.getCurrencyInstance(Locale.CANADA);
		System.out.println(nf.format(saldo));
		
		//Conversão
		nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.parse("$100.25"));

	}

}
