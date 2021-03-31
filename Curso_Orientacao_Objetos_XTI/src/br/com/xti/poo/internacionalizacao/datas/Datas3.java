package br.com.xti.poo.internacionalizacao.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Datas3 {
	
	public static void main(String[] args) {
		
		//Construindo calendario
		Calendar c = Calendar.getInstance();
		
		//Definindo data
		c.set(2021, Calendar.MARCH, 30);
		
		//Criando um objeto date
		Date date = c.getTime();
		
		//Local
		Locale padrao = Locale.getDefault();
		Locale brasil = new Locale("pt","BR");
		Locale india = new Locale("hi","IN");
		Locale usa = Locale.US;
		Locale japan = Locale.JAPAN;
		Locale italy = Locale.ITALY;
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, italy);
		System.out.println(df.format(date));
		
	
		
	}

}
