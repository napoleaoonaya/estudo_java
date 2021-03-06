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

public class Arquivo3 {
	
	private Path path = Paths.get("c:/xti/files/contas.txt");
	private Charset utf8 = StandardCharsets.UTF_8;
	
	public void escreveArquivo(ArrayList<Conta> contas){
		
		//Classe para trabalhar com escrita em 
		//BufferedWrite
		
		try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, utf8)) {
			
			for(Conta conta : contas) {
				bufferedWriter.write(conta.getCliente()+";"
						+conta.getSaldo()+"\n");
			}
			
			bufferedWriter.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public ArrayList<Conta> recuperarArquivo(){
		
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		//Classe para recupera??o de dados
		//BufferedReader
		
		try (BufferedReader bufferedReader = Files.newBufferedReader(path, utf8)) {
		
			String lines = null;
			
			while((lines = bufferedReader.readLine()) != null) {
				
				//Tokeniza??o
				String[] dados = lines.split(";");
				
				//Armazenou no objeto conta todos valores do arquivo
				Conta conta = new Conta(dados[0],Double.parseDouble(dados[1]));
				
				//Adicionou a lista todos valores do arquivo
				contas.add(conta);
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Retornou a lista
		return contas;
		
	}
	

	public static void main(String[] args) {
		
		//Criar o ArrayList de contas
//		ArrayList<Conta> contas = new ArrayList<Conta>();
//		
//		//Populando o ArrayList
//		contas.add(new Conta("Napole?o Kazu Onaya", 1000));
//		contas.add(new Conta("Daniel de Sousa Onaya", 1000));
//		
//		//Verifica se ArrayList esta populado
////		for (int i = 0; i < contas.size(); i++) {
////			System.out.println("Cliente: "+contas.get(i).getCliente()+
////					" - Saldo: "+contas.get(i).getSaldo());
////		}
//		
//		//Exibe o saldo o cliente
////		for(int x = 0; x < contas.size(); x++) {
////			contas.get(x).exibeSaldo();
////		}
//		
//		//Instanciou a classe Arquivo3 
		Arquivo3 files = new Arquivo3();
//		
//		//Chamou o m?todo para gravar dados no arquivo
//		files.escreveArquivo(contas);
		
		//Pego o m?todo e devolvou um ArrayList
		ArrayList<Conta> conta = files.recuperarArquivo();
		
		//Itero no ArrayList
		for(Conta i : conta) {
			//Devolvou o cliente e o saldo
			i.exibeSaldo();
		}
		
	}

}
