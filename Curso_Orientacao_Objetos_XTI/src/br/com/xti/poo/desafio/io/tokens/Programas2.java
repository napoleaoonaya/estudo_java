package br.com.xti.poo.desafio.io.tokens;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Programas2 {
	
	// Caminho para armazenar
	Path path = Paths.get("c:/xti/files/contas.txt");

	// Charset para utf-8
	Charset utf8 = StandardCharsets.UTF_8;

	public void armazenarContas(ArrayList<Conta> contas) {

		try (BufferedWriter wr = Files.newBufferedWriter(path, utf8)) {

			for (Conta c : contas) {
				//Abre arquivo e escreve 
				wr.write(c.getCliente() + ";" + c.getSaldo() + "\n");
				//Salva dados
				wr.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<Conta> recuperaContas(){
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		try(BufferedReader read = Files.newBufferedReader(path,utf8)){
			
			String line = null;
			
			while((line = read.readLine())!= null) {
				
				//Tokenização
				//split para quebra (;)
				String[] t = line.split(";");
				System.out.println(t[0]+t[1]);
				
				//Cria o objeto conta
				Conta conta = new Conta(t[0],Double.parseDouble(t[1]));
				
				//Popula a lista
				contas.add(conta);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return contas;
	}

	public static void main(String[] args) {

		// Recebe uma lista de contas
		ArrayList<Conta> contas = new ArrayList<Conta>();

		// Dentro das contas adicionar varios objetos do tipo conta
//		contas.add(new Conta("Napoleão Kazu Onaya", 100_000_000.00));
//		contas.add(new Conta("Daniel de Sousa Onaya", 1_000.00));
//		contas.add(new Conta("Atila Felipe Onaya", 10_000.00));
//		contas.add(new Conta("Leila Augusta de Oliveira Onaya", 1000.00));
//		contas.add(new Conta("Kazushiko Onaya", 100_000_000_000.00));
//		contas.add(new Conta("Natalia Yure Onaya", 100_000.00));
//		contas.add(new Conta("Priscila Ferreia Soutero Onaya", 10_000_000.00));

		Programas2 prog2 = new Programas2();
		prog2.armazenarContas(contas);
		
		System.out.println("\n");
		
// Aqui recupera a conta
		prog2.recuperaContas();
		
//Aqui recupera a conta e exibe o saldo	de todas as contas	
		for(Conta conta : contas) {
			conta.exibeSaldo();
		}
		
	}

}
