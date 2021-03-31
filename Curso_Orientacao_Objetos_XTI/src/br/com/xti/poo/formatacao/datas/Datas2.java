package br.com.xti.poo.formatacao.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Datas2 {

	public static void main(String[] args) throws ParseException {
		
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		Date date = c.getTime();
		System.out.println(date);
		
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));
		
		DateFormat df = DateFormat.getTimeInstance();
		System.out.println(df.format(date));
		
		DateFormat daf = DateFormat.getDateTimeInstance();
		System.out.println(daf.format(date));
		
		//Estilos 
		DateFormat datf = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(datf.format(date));
		
		
		
		//Converter uma String em uma Data
	 	Date data2 = datf.parse("12/02/1980");
	 	System.out.println(data2);
	 	
	 	//SimpleDateFormat
	 	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	 	System.out.println(sdf.format(date));
	 	System.out.println(sdf.parse("10/10/2010"));

	 	
	}

}
