/**
 * Operadores de comparação
 * @author Napoleão Kazu Onaya
 */

public class Aula15 {
    
    public static void main(String[] args) {
        
        int x = 6;

        /**
         * Operador de comparação sempre retorna um boolean
         * ou verdadeiro ou falso
         */
        
        System.out.println("X igual a 6 " + (x == 6));

        System.out.println("X diferente de 6 " + (x != 6));

        System.out.println("X maior que 2 " + ( x > 2));

        System.out.println("X menor que 2 " + ( x < 2));

        System.out.println("X maior ou iqual a 6 " + ( x >= 6));

        System.out.println("X menor ou iqual a 6 " + ( x <= 2));

        /**
         * Operador instanceof somente para objetos
         */

        Integer l = 6;
        System.out.println(l instanceof Integer);

        //String é um objeto de Wapper
        System.out.println("Oi" instanceof String);
    }
}
