package br.com.xti.poo.serializacao.de.contas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import br.com.xti.poo.Conta;

public class Serializa2 {

	//private Path path = Paths.get("c:/xti/files/contas.txt");
	//private Charset utf8 = StandardCharsets.UTF_8;

	public void escreveArquivo(ArrayList<Conta> contas) throws IOException {

		try (FileOutputStream fos = new FileOutputStream("c:/xti/files/contas.ser")) {
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				oos.writeObject(contas);
			}
		}

		// Classe para trabalhar com escrita em
		// BufferedWrite

//		try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, utf8)) {
//
//			for (Conta conta : contas) {
//				bufferedWriter.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
//			}
//
//			bufferedWriter.flush();
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

	public ArrayList<Conta> recuperarArquivo() throws FileNotFoundException, IOException, ClassNotFoundException {

		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		try(FileInputStream fis1 = new FileInputStream("c:/xti/files/contas.ser");){
			try(ObjectInputStream ois1 = new ObjectInputStream(fis1)){
				return (ArrayList<Conta>) ois1.readObject();
			}
		}

		// Classe para recuperação de dados
		// BufferedReader

//		try (BufferedReader bufferedReader = Files.newBufferedReader(path, utf8)) {
//
//			String lines = null;
//
//			while ((lines = bufferedReader.readLine()) != null) {
//
//				// Tokenização
//				String[] dados = lines.split(";");
//
//				// Armazenou no objeto conta todos valores do arquivo
//				Conta conta = new Conta(dados[0], Double.parseDouble(dados[1]));
//
//				// Adicionou a lista todos valores do arquivo
//				contas.add(conta);
//
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		// Retornou a lista
//		return contas;

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Criar o ArrayList de contas
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		//Populando o ArrayList
		contas.add(new Conta("Napoleão Kazu Onaya", 1000));
		contas.add(new Conta("Daniel de Sousa Onaya", 1000));
		
		//Verifica se ArrayList esta populado
//		for (int i = 0; i < contas.size(); i++) {
//			System.out.println("Cliente: "+contas.get(i).getCliente()+
//					" - Saldo: "+contas.get(i).getSaldo());
//		}
//		
//		//Exibe o saldo o cliente
//		for(int x = 0; x < contas.size(); x++) {
//			contas.get(x).exibeSaldo();
//		}
//		
//		//Instanciou a classe Arquivo3 
		Serializa2 files = new Serializa2();
//		
//		//Chamou o método para gravar dados no arquivo
//		files.escreveArquivo(contas);
		
//		// Pego o método e devolvou um ArrayList
		ArrayList<Conta> conta = files.recuperarArquivo();
//
//		// Itero no ArrayList
		for (Conta i : conta) {
			// Devolvou o cliente e o saldo
			i.exibeSaldo();
		}

	}

}
