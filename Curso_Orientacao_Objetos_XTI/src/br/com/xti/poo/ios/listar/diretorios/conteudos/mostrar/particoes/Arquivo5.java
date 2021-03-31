package br.com.xti.poo.ios.listar.diretorios.conteudos.mostrar.particoes;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {
		
		//Usamos o Iterable<E> para recuperamos o mesmo no for

		//Mostra todos os diretórios da máquina
//		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
//
//		for (Path path : dirs) {
//			System.out.println(path);
//		}
		
//		//Listar o conteúdo de uma diretório
//		Path dir = Paths.get("c:/xti/files");
//		//Recuperar o Stream de Diretorios
//		
//		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
//			
//			//Mostra o nome dos arquivos ou diretórios, vai depender do nome do dir!
//			for(Path path : stream) {
//				System.out.println(path.getFileName());
//			}
//			
//		} catch (IOException | DirectoryIteratorException e) {
//			e.printStackTrace();
//		}
		
		//Partições 
		FileSystem fs = FileSystems.getDefault();
		for(FileStore fileStore : fs.getFileStores()) {
			
			System.out.println("Unidades: "+fileStore.toString());
			System.out.println("Total disco: "+fileStore.getTotalSpace());
			System.out.println("Total disponivel: "+fileStore.getUnallocatedSpace());
			System.out.println("Total usado: "+(fileStore.getTotalSpace()-fileStore.getUsableSpace()));
			
		}
		
		
	}

}
