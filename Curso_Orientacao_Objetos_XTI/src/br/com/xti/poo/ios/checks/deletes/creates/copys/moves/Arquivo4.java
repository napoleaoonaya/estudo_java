package br.com.xti.poo.ios.checks.deletes.creates.copys.moves;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
		
		//Path path = Paths.get("c:/xti/files/texto.txt");
		
		//Create
		//Files.createFile(path);
		
		//Salvando valores dentro do arquivo
		//Files.write(path, "Meu texto".getBytes());
		
		//Copy
//		Path copia = Paths.get("c:/xti/files/copia.txt");
//		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
//		
		//Mover
		
//		//Aponta o (caminho mais o nome do arquivo)
//		Path path = Paths.get("c:/xti/files/fonte.txt");
//		//Aponta para o (caminho destino mais nome do arquivo)
//		Path mover = Paths.get("c:/xti/files/move/fonte.txt");
//		Files.createDirectories(mover.getParent());
//		Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);
		
		Path path2 = Paths.get("c:/xti/files/image.jpg");
		Path mover2 = Paths.get("c:/xti/files/move_images/image.jpg");
		Files.createDirectory(mover2.getParent());
		Files.move(path2, mover2, StandardCopyOption.REPLACE_EXISTING);
		
//		//Se existe o arquivo e o diretório
//		System.out.println(Files.exists(path));
//		//Se o caminho é um diretório
//		System.out.println(Files.isDirectory(path));
//		//Se o arquivo é regular
//		System.out.println(Files.isRegularFile(path));
//		//Se o arquivo tem permissão de leitura
//		System.out.println(Files.isReadable(path));
//		//Se o arquivo tem permissão de execussão
//		System.out.println(Files.isExecutable(path));
//		//Qual o tamanho do arquivo
//		System.out.println(Files.size(path));
//		//Quando o mesmo foi modificado
//		System.out.println(Files.getLastModifiedTime(path));
//		//Quem criou o arquivo
//		System.out.println(Files.getOwner(path));
//		//Tipo do arquivo
//		System.out.println(Files.probeContentType(path));
		
		//Delete
		//Files.delete(path);
		//Deleta se existe
		//Files.deleteIfExists(path);
		
		
		
		
		
	}

}
