package br.com.xti.poo.manipulacao.data.hora;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Datas {

	public static void main(String[] args) {
		
		//Data objetos date
		//Calendar manipuladas por objetos de Calendar
		
		//Milis segundos 01 de Jan 1970 at� agora
		System.out.println(System.currentTimeMillis());
		
		//Criar uma data objeto do tipo Date
		Date agora = new Date();
		System.out.println(agora);
		
		//Outros m�todos construtores
		
		Date data = new Date(1_000_000);
		System.out.println(data);

		//M�todos
		
		//Hora atual
		data.getTime();
		//Tempo em milisegundos
		data.setTime(100);
		//coparador de datas
		System.out.println(data.compareTo(agora));// - 1, 0, 1
		
		//Manipular datas
		//Calendar n�o inst�ncia pois � abstrata
		
		Calendar c = Calendar.getInstance();//Gregoriano
		//new GregorianCalendar();
		c.set(1980, Calendar.FEBRUARY, 12);
		System.out.println(c.getTime());
		
		//Recuperar informa��es sobre a data
		System.out.println(c.get(Calendar.YEAR));//ano
		System.out.println(c.get(Calendar.MONTH));//m�s 0 - 11, 0 janeiro , 11 dezembro
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//dia do m�s
		
		c.set(Calendar.YEAR, 2021);//altera o ano
		c.set(Calendar.MONTH, Calendar.MARCH);//altera o m�s
		c.set(Calendar.DAY_OF_MONTH, 25);//altera o ano
		
		System.out.println(c.getTime());
		
		//Limpar campos
		
		c.clear(Calendar.MINUTE);//removeu minuto
		c.clear(Calendar.SECOND);//removeu segundo
		System.out.println(c.getTime());
		
		//adicionar unidades de tempo
		c.add(Calendar.DAY_OF_MONTH,1);
		c.add(Calendar.YEAR, 1);
		System.out.println(c.getTime());
		
		//diminuir unidade de tempo
		c.add(Calendar.DAY_OF_MONTH,-1);
		c.add(Calendar.YEAR, -1);
		System.out.println(c.getTime());
		
		c.roll(Calendar.DAY_OF_YEAR, 2025);
		System.out.println(c.getTime());
		
		/**
		 * Sauda��o com bom dia, boa tarde, boa noite
		 * 
		 */
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		if(hora<=12) {
			System.out.println("Bom dia! "+c1.getTime());
		}else if(hora>12 && hora<18) {
			System.out.println("Boa tarde! "+c1.getTime());
		}else {
			System.out.println("Boa noite! "+c1.getTime());
		}
		
		
	}

}
