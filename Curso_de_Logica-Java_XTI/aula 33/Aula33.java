/**
 * Fluxo de repetição LOOP
 * 
 * for
 * 
 * for(inicializacao,teste,atualizacao){acao}
 * 
 * @author Napoleão Kazu Onaya
 */

public class Aula33 {
    
    public static void main(String[] args) {
        
        String texto = "";
        for (int i = 0; i < 4; i++) {
            texto += i + ",";
        }
        System.out.println(texto);

        String texto2 = "";
        for (int j = 10; j > 0; j--) {
            texto2 += j + ",";
        }
        System.out.println(texto2);

        System.out.println("\n");

        System.out.println("Todos numeros pares no intervalo de 0 a 20");

        String texto3 = "";
        for (int x = 0; x < 20; x++) {
            if (x%2 == 0) {
                texto3 += x + ",";
            }
        }
        System.out.println(texto3);

        System.out.println("\n");

        System.out.println("Todos numeros impares no intervalo de 0 a 20");

        String texto4 = "";
        for (int t = 0; t < 20; t++) {
            if (t%2 != 0) {
                texto4 += t + ",";
            }
        }
        System.out.println(texto4);

        int tamanho = 4;
        for (int w = 0; w < tamanho; w++) {
            for(int t =0; t< tamanho; t++){
                System.out.print("*");
            }
            System.out.println("\n");
        }

        //Cuidado com o uso do for lembre-se sempre
        //de definir um condição senão o programa pode
        //entrar em um laço infinito caso a condição seja 
        //verdadeira para sempre
    }
}
