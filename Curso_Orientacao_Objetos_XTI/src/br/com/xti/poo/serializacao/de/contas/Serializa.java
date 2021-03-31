package br.com.xti.poo.serializacao.de.contas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import br.com.xti.poo.Conta;

public class Serializa {

	public static void main(String[] args) throws Exception {

		// Objetos Serializavel tem que implementar Serializable
		String[] nomes = { "napoleão", "atila", "leila", "priscila" };

		// Escrita do objeto
		FileOutputStream fos = new FileOutputStream("c:/xti/files/objeto.ser");

		// Realizar operação de gravar objetos
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// Gravou
		oos.writeObject(nomes);

		// Fechou
		oos.close();

		// Leitura de objetos
		FileInputStream fis = new FileInputStream("c:/xti/files/objeto.ser");

		ObjectInputStream ois = new ObjectInputStream(fis);

		String[] nomes1 = (String[]) ois.readObject();

		ois.close();

		System.out.println(Arrays.toString(nomes1));

		// Para Armazenar uma conta
		
		Conta conta1 = new Conta("Napoleão", 1000.00);
		Conta conta2 = new Conta("Daniel", 1000.00);

		FileOutputStream fos1 = new FileOutputStream("c:/xti/files/objeto2.ser");
		// Realizar operação de gravar objetos
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		// Gravou
		oos1.writeObject(conta1);
		oos1.writeObject(conta2);
		// Fechou
		oos1.close();

		// Leitura de objetos
		FileInputStream fis1 = new FileInputStream("c:/xti/files/objeto2.ser");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
		conta1 = (Conta) ois1.readObject();
		conta2 = (Conta) ois1.readObject();
		ois1.close();

		conta1.exibeSaldo();
		conta2.exibeSaldo();
		
		// Casting 
		// Classe obj = (Classe) args.method();
		// Casting de objeto já criado
		// obj = (Classe) args.method();
		
		//O que é serializado dentro do objeto são as variaveis
		//static não são armazenadas
		//transient não deixa exposto (para senha,etc);

	}

}
