import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Desafio lista de compras 
 * 
 * @author Napoleão Kazu Onaya
 */

public class Aula36 {
    
    public static void main(String[] args) {

        //Cria a lista de produtos
        ArrayList<String> listaProdutos = new ArrayList<String>();

        //Cria o objeto para entrada de dados
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o nome dos produtos da lista de compra para sair digite FIM");

        //Cria a variavel produto
        String produto;

        //Laço de repetição
        while (!"FIM".equals(produto = teclado.nextLine())) {
            //Adiciona dentro da lista os produtos
            listaProdutos.add(produto);
        }

        //Imprime a lista de produtos
        System.out.println(listaProdutos.toString());
    }


}
