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
import java.util.Arrays;

import br.com.xti.poo.Conta;

public class Programas {
	
	
	
	public static void main(String[] args) throws IOException {
		
		//Recebe uma lista de contas
		ArrayList<Conta>contas = new ArrayList<Conta>();	

		//Dentro das contas adicionar varios objetos do tipo conta
		contas.add(new Conta("Napoleão Kazu Onaya", 100_000_000.00));
		contas.add(new Conta("Daniel de Sousa Onaya", 1_000.00));
		contas.add(new Conta("Atila Felipe Onaya", 10_000.00));
		contas.add(new Conta("Leila Augusta de Oliveira Onaya", 1000.00));
		contas.add(new Conta("Kazushiko Onaya", 100_000_000_000.00));
		contas.add(new Conta("Natalia Yure Onaya", 100_000.00));
		contas.add(new Conta("Priscila Ferreia Soutero Onaya", 10_000_000.00));
		
		//Verificar se ArrayList esta populado
//		for(int i = 0; i<contas.size(); i++) {
//			System.out.println(contas.get(i).getCliente()+" - "+contas.get(i).getSaldo());
//		}                  
		
		//Caminho do diretorio mais nome do arquivo
		Path path = Paths.get("c:/xti/files/contas.txt");
		
		//Cria o diretório
		Files.createDirectories(path.getParent());
		
		//Cria o arquivo
		byte[] bytes = "".getBytes();
		Files.write(path, bytes);
		
		//Escrita
				
		//Charset UTF-8 para gravar os caracteres
		Charset charset = StandardCharsets.UTF_8;
				
		//Criando objeto de escrita
		try(BufferedWriter w = Files.newBufferedWriter(path, charset)){	
			
			for(int i = 0; i<contas.size(); i++) {
				
				w.write(contas.get(i).getCliente()+","+contas.get(i).getSaldo()+"\n");
				
				w.flush();
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
				
		//Ler contas 
		
		try(BufferedReader reader = Files.newBufferedReader(path, charset)){
			
			//Linhas em branco
			String lines = null;
			
			while((lines = reader.readLine())!= null) {
				System.out.println(lines);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
