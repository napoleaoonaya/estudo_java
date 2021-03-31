/**
 * Constantes e modificadores finais, regras de nomeação
 * @author Napoleão Kazu Onaya
 */

public class Aula09 {
    
    public static void main(String[] args) {

        /**
         * Modificadores sempre com letra minúscula
         * 
         * Para objetos
         * public, private, protected
         * 
         * Para constantes
         * final
         */
        
        int populacaoBrasileira = 203429773;

        final double PI = 3.14159265358979323846;

        System.out.println(PI);

        //Aqui da erro de compilação pois não podemos atribuir um valor uma constante
        //PI = 3.14
        //System.out.println(PI);

        //Constantes devem sempre ser escritas em letras maiuscula
        //Se a constante for composta o nome deve ser separado por underscore

        final char SEXO_FEMININO = 'F';

        System.out.println(SEXO_FEMININO);

    }
}
