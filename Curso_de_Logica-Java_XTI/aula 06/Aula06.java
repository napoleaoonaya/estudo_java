/**
 * Apresentar o conceito de variáveis
 * @author Napoleão Kazu Onaya
 */

public class Aula06 {
    
    public static void main(String[] args) {
    
        /* Variáveis são referencias a dados */

        System.out.println("Temos aqui um texto literal String");

        /* Variável é sempre criada primeiro informando o tipo,nome,depois valor 
        finalizado com ponto e virgula */

        /* Variável sempre começa com letra minúscula */

        /* Não pode criar variável iniciando com número e nem com espaços */

        /* Sempre deixe o nome das variáveis de facil entendimento */

        /* Variáveis não pode ter nome de palavra chaves do java atenção! */

        String nome = "Napoleão Kazu Onaya";
        int idade = 36;
        boolean casado = true;

        /* Também podemos criar a variáveis sem definir uma valor */

        String nomeMeio, sobreNome;

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Casado: "+casado);

    }    
}
