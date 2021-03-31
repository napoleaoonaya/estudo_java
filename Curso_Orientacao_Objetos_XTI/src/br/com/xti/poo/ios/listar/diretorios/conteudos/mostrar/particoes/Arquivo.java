package br.com.xti.poo.ios.listar.diretorios.conteudos.mostrar.particoes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		//Usa-se isso para arquivos pequenos
		
		//File java 5 e 6
		
		//Path no java 7
		
		//Caminho e localiza��o usa a classe Path
		
		//nio grandes sistemas de volume de informa��o
		
		//Arquivo ou diret�rio
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
		 * Criar diret�rio para armazenar
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
		
		//L� os arquivos
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String(retorno));
		
//	video,images,som	               Biblioteca IO                   texto
//	Streams de Bytes					  Object                 Streams de Caracteres
//	  InputStream       OutputStream                    Reader                          Write
//	  FileInputStream	FileOutputStream                BufferedReader      BufferedWritter PrintWriter
//	  FilterInputStram 	FilterOutputStream              InputStreamReader        OutputStreamWriter
//		                                                            Paths    Files
// Todas herdam de Object
		
		
//Para video, audio, imagem use Streams de Bytes		
		
		
	}

}
