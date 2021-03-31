import java.util.Arrays;

/**
 * Coleção de dado Array
 */
public class Aula22 {

    public static void main(String[] args) {
        
        //Criando um Array
        
        //Valores:

        //Lista de paises
        //Brasil, Russia, China, Russia

        //Lista de números
        //1,2,3,4

        //Valores relacionados pais e numero
        //porém só o programador vai entender isso
        String pais1 = "Brasil";
        String pais2 = "Russia";
        String pais3 = "China";
        String pais4 = "Russia";

        //Array é um conjunto indexado de informação
        //Tipo[] nomeArray = {};

        //Exemplo
        //Criando um array
        String[] paises = {"Brasil","Russia","China","Russia"};
        //Recuperando o pais na posição inicial
        System.out.println(paises[0]);

        //Atenção um array sempre começa na posição zero!

        //Relação de chave valor indexação
        //pais[0]

        //Alterar um elemento na posição
        paises[0] = "Brazil";

        System.out.println(paises[0]);

        //Inicialização de array definindo um tamanho
        //Tipo[] nomeArray = new Tipo[Tamanho]
        int[] impares = new int[3];

        impares[0] = 15;
        impares[1] = 99;
        impares[2] = 7;

        //Imprimido um array quantidade de valores do array
        System.out.println(impares.length);

        //Para mostrar todos valores de um array, usamos a classe Arrays do java.util.Arrays
        System.out.println("array sem ordenacao: "+Arrays.toString(impares));

        //Para pesquisa dentro de um array
        System.out.println("posicao: "+Arrays.binarySearch(impares, 15) + " - array valor: " + impares[0]);

        //Podemos ter array de objeto,  tipo primitivo

        //Ordenação de array
        Arrays.sort(impares, 0, impares.length);

        System.out.println("array ordenado: "+Arrays.toString(impares));

        //Acessando um valor direto do array
        Double[] numero = {12.45,15.99,7.5,8.997};
        System.out.println("Valor do numero: "+numero[3].doubleValue());

        
    }
    
}
