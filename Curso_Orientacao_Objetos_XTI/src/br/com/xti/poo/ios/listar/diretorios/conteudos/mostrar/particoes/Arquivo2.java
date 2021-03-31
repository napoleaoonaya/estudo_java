package br.com.xti.poo.ios.listar.diretorios.conteudos.mostrar.particoes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) {
		
		Path path = Paths.get("c:/xti/files/teste.txt");
		
		Charset utf8 = StandardCharsets.UTF_8;
		
		//Para o java 7 em diante você pode definir a variavel dentro do try
		//que o mesmo fecha a classe porque ele herda de Closeable
		
		/**
		 * Escrita
		 */
		
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8 )) {
			
			//escrevendo no arquivo
			w.write("Texto\n");
			w.write("Napoleão\n");
			w.write("Priscila\n");
			
			//chama o flush automaticamente 
			//w.flush();
			//pode ser omitido se o arquivo for pequeno,
			//para arquivos grandes manter
			
			//o try já abre e fecha o arquivo!
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		/**
		 * Leitura
		 */
		
		try(BufferedReader read = Files.newBufferedReader(path, utf8)){
			
			//Cria variavel linha
			String line = null;
			
			//Adiciona a linha cada dado lido enquanto for diferente de nulo
			while((line = read.readLine()) != null) {
				//Escreve os dados 
				System.out.println(line);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
