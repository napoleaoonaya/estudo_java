/**
 * Variáveis de referência, conceitos de memória e garbage colector
 * @author Napoleão Kazu Onaya
 */

public class Aula08 {
    
    public static void main(String[] args) {
      
        //Variável primitiva
        int x = 7;
        x = 9;

        /**
         * O garbage collector gerência dados que não 
         * estão mais linkados liberando memória
         */

        //Variável de referência
        //Dados de objetos
        String y = "XTI";
        y = "xti.com.br";

        y = null;

        System.out.println(y);

    }
}
