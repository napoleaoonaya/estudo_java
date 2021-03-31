package br.com.xti.poo.classe.inputs.outpts.entrada.saida.de.dados.grandes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo3 {

	public static void main(String[] args) {
		
		Path path = Paths.get("c:/xti/files/teste.txt");
		
		Charset utf8 = StandardCharsets.UTF_8;
		
		/**
		 * Escrita
		 */
		
		//Jeito antigo de programar
		
		//Criando objeto de escrita
		BufferedWriter w = null;
		
		try {
			
			//Abrindo o arquivo para escrita no caminho e com encode UTF-8
			w = Files.newBufferedWriter(path, utf8 );
		
			//escrevendo no arquivo
			w.write("Texto\n");
			w.write("Napoleão\n");
			w.write("Priscila\n");
			
			//gravando
			w.flush();
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			//fecha arquivo
			if(w != null) {
				try {
					//fecha o arquivo aqui
					w.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/**
		 * Leitura
		 */
		
		BufferedReader read = null;
		
		try{
			
			read = Files.newBufferedReader(path, utf8);
			
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
