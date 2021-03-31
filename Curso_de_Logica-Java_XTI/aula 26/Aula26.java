import javax.swing.JOptionPane;

/**
 * Fluxo Condicional
 * 
 * if
 * 
 * @author Napoleão Kazu Onaya
 */

public class Aula26 {
    
    public static void main(String[] args) {

        //Recebendo a variável digitada
        String idadeTexto = JOptionPane.showInputDialog("Informe sua idade!");
    
        //Convertendo a variavel digitada para um numero inteiro
        int idade = Integer.parseInt(idadeTexto);

        //Entra na avaliação condicional se a idade for menor que 18
        if (idade<18) {
            String msg1 = "Voce e menor de idade!";    
            JOptionPane.showMessageDialog(null, msg1);

            //Encerra o dialog aqui e não prossegue para frente
            System.exit(0);
        }

        String msg2 = "Voce e maior de idade!";

        //Não entrou na avaliação condicional
        JOptionPane.showMessageDialog(null, msg2);

        //Atenção no dia a dia da programação podemos usar o if sozinho,
        //porém quando o mesmo for usado lembre-se de dentro do if encerrar
        //seu processo,senão o sistema continua o processo,se tirarmos o 
        //System.exit(0),se digitarmos um idade menor que 18,e mostraria
        //no JOptionPane as duas mensagems de Voce e menor de idade e
        //Voce e maior de idade


    }
}
