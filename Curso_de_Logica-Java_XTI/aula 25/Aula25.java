import java.util.ArrayList;

/**
 * Collenction Framework - ArrayList
 * 
 * ArrayList é uma classe do pacote java.util.ArrayList
 * 
 * O ArrayList foi criado para ajudar na falha do uso de
 * array[] que quando erra definido não deixava incluir
 * mais elementos
 * 
 * @author Napoleão Kazu Onaya
 */

public class Aula25 {
    
    public static void main(String[] args) {

        //Notação antiga para usar o ArrayList
        ArrayList<Integer> idades = new ArrayList<Integer>();

        //Adicionando dados no ArrayList
        idades.add(21);
        idades.add(35);
        idades.add(40);
        idades.add(98);

        //Removendo um elemento de ArrayList
        //Para remover passa-se o indice na função remove(indice)
        idades.remove(3);

        //Para varrer o ArrayList e pegar todos valores
        for(int i = 0; i<idades.size(); i++){
            System.out.print(idades.get(i)+",");
        }

        System.out.println("\n");

        //Pesquisando elementos no ArrayList
        //Para pesquisar todos os elementos usamos a função toString
        System.out.println("ArrayList de idades: "+idades.toString());

        //Ver quantidade total de elementos de um ArrayList
        System.out.println("Tamanho do ArrayList: "+idades.size());

        //Pesquisar o valor de um elemento
        System.out.println("Elemento no indice 0: "+idades.get(0));

        //Pesquisa para ver o indice de um elemento
        System.out.println("Indice da idade 40: "+idades.indexOf(40));

        //Verificar se um elemento existe, retornando um booleano
        System.out.println("Tem idade 40: "+idades.contains(40));

        //Notação para usar o ArrayList java 7 em diante
        ArrayList<String> nomes = new ArrayList<>();

    }
}
