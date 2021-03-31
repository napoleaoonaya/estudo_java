import java.util.Arrays;
import java.util.List;

public class Aula23{

    public static void main(String[] args) {
        
        /**
         * Array multidimensional
         * ou matrizes de dados
         */

        //Uma unica dimensao
        String[] pessoas = {"Napoleão","Ricardo","Sandra","Priscila"};

        //Acessando o valor do array na primeira posição
        System.out.println(pessoas[0]);

        //Quantos elementos tem no array
        System.out.println(pessoas.length);
        
        //Array de duas dimensoes
        String[][] pessoaCidade = {
            {"Napoleão", "São Paulo"},
            {"Ricardo", "Minas Gerais"},
            {"Sandra", "Parana"},
            {"Priscila", "Santa Catarina"}
        };

        //Acessando o valor do array de duas dimensões na primeira posição 
        System.out.println(pessoaCidade[0][0]);

        //Quantos elementos tem dentro de array de multidimensao
        System.out.println(pessoaCidade.length);

        //Quantos elementos tem dentro da primeira posição do array de multidimensao
        System.out.println(pessoaCidade[0].length);

        System.out.println("array sem modificar: "+pessoaCidade[3][1]);

        //Modificando valores do array de multidimensao
        pessoaCidade[3][1] = "Rio Grande do Sul";

        System.out.println("array modificado: "+pessoaCidade[3][1]);

        String[][][] nomeEstadoCidade = {
            {
                {"Napoleao","SP","Sao Paulo"}
            }
        };

        System.out.println(nomeEstadoCidade.length);
        System.out.println(nomeEstadoCidade[0].length);
        System.out.println(nomeEstadoCidade[0][0][0]+"\n"+
        nomeEstadoCidade[0][0][1]+"\n"+nomeEstadoCidade[0][0][2]);

        //Lambda para duas dimensões
        int[][] matriz = {{1, 2, 3, 4, 5, 6}, {8, 10, 12, 14}};
        Arrays.asList(matriz).forEach((i) -> { System.out.println(Arrays.toString(i)); });

    }
}