package br.com.xti.poo.recursividade;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {
	
	/* 10 + (10 - 1) */
	/* 10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + (1 + (0) ) ) ) ) ) ) ) ) ) */
	
	public static int soma(int x) {
		if(x == 0) {
			return x;
		} else {
			//System.out.println(x);
			return x + soma(x - 1);
		}
	}
	
	/* potencia(x, y) */
	/* potencia(2, 2) = 2 * 2 */
	public static int potencia(int x, int y) {
		//Parte conhecida
		if(y == 1) {
			return x;
		} else {
			//System.out.println(x);
			return x * potencia(x, (y - 1));
		}
	}
	
	/* fatorial(4) = 4.3.2.1.0! */
	/* 0! = 1 */
	public static double fatorial(double x) {
		if(x == 0) {
			return 1;
		} else {
			return x * fatorial(x - 1);
		}
	}
	
	//Recursividade para listar diretórios e arquivos
	public static void listar(Path path) {
		
		if(Files.isRegularFile(path)) {
			System.out.println(path.toAbsolutePath());
		} else {
			String s = "\n" + path.toAbsolutePath();
			System.out.println(s.toUpperCase());
			//System.err.println(path.toAbsolutePath());
			try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
				for(Path p : stream) {
					//System.out.println(p.toAbsolutePath());
					listar(p);
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Soma: "+soma(10));
		System.out.println("Potência: "+potencia(2, 2));
		System.out.println("Fatorial: "+fatorial(5));
		
		listar(Paths.get("C:/xti/"));
	}

}
