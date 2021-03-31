import java.util.Scanner;

/**
 * Desafio sequência de Fibonacci
 * 
 * @author Napoleão Kazu Onaya
 */

public class Aula39 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int numero = teclado.nextInt();

        int anterior = 0;
        int proximo = 1;
        
        System.out.println(anterior);

        while(proximo<numero){
            System.out.println(proximo);
            proximo = proximo + anterior;//Inicia
            anterior = proximo - anterior;//Atualiza
        }

    }
}
