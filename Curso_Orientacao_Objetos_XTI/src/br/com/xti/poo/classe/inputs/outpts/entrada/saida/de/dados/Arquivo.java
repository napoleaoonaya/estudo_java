package br.com.xti.poo.classe.inputs.outpts.entrada.saida.de.dados;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		//File java 5 e 6
		
		//Path no java 7
		
		//Caminho e localização usa a classe Path
		
		//nio grandes sistemas de volume de informação
		
		//Arquivo ou diretório
		//windows c:/
		Path path = Paths.get("c:/xti/files/teste.txt");
		
		//linux /
//		Path path = Paths.get("/xti/files/teste.txt");
		
		//retorna o caminho absoluto
		System.out.println(path.toAbsolutePath());
		
		//retorna o caminho do pai
		System.out.println(path.getParent());
		
		//retorna a raiz do path
		System.out.println(path.getRoot());
		
		//retorna o nome do arquivo
		System.out.println(path.getFileName());
		
		/**
		 * Criar diretório para armazenar
		 * 
		 */
		
		Files.createDirectories(path.getParent());
		
		/**
		 * Escrever arquivos
		 * 
		 */

		byte[] bytes = "Meu texto".getBytes();
		
		//Criar arquivo e fecha ideal para arquivo pequeno
		Files.write(path, bytes);//cria, limpa, escreve
		
		/**
		 * Ler arquivos
		 * 
		 */
		
		//Lê os arquivos
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));
		
		
		
		
	}

}
