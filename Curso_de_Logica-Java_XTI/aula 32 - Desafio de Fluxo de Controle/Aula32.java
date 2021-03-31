import java.util.Random;

import javax.swing.JOptionPane;

/**
 *  Faça um programa que :
 * 
 * 1 - Qual o palpite
 * 2 - Qual o valor do dado
 * 3 - Palpite esta correto 
 * 
 */

public class Aula32 {

    public static void main(String[] args) {
     
        //Qual o palpite
        String palpiteTexto = JOptionPane.showInputDialog("Informe um numero de 1 a 6: ");

        int numero = Integer.parseInt(palpiteTexto);

        //Qual o valor do dado
        int[] dado = {1,2,3,4,5,6};

        Random randomDado = new Random();

        //Soma-se um ao tamanho total do array porque o mesmo começa na
        //posição zero e se não somar o um ele ira considerar o zero
        int numeroDadoAleatorio = randomDado.nextInt(dado.length+1);

        //Palpite esta correto
        if (numero == numeroDadoAleatorio) {
            System.out.println("Numero escolhido: "+ numero + "\n"+ "Numero sorteado: " + numeroDadoAleatorio);
            String msg = "Parabens voce acertou o palpite";
            JOptionPane.showMessageDialog(null,msg);
        } else {
            System.out.println("Numero escolhido: "+ numero + "\n"+ "Numero sorteado: " + numeroDadoAleatorio);
            String msg = "Voce errou o palpite";
            JOptionPane.showMessageDialog(null,msg);
        }

    }

}
