import java.util.ArrayList;

/**
 * foreach
 * 
 * @author Napoleão Kazu Onaya
 */

public class Aula34 {
    
    public static void main(String[] args) {
        
        int[] pares = {2,4,6,8};

        for (int i = 0; i < pares.length; i++) {
            int par = pares[i];
            System.out.println(par);
        }

        System.out.println("\n");

        /**
         * Percorra os elementos int de par para o
         * array pares
         */

        //foreach 
        //Só percorre os elementos para frente
        //não tem acesso ao i e não pode voltar
        for (int par : pares) {
            System.out.println(par);
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for (Integer numero : list) {
            System.out.println(numero);
        }
    }
}
