import javax.swing.JOptionPane;

/**
 * Recuperar informações de forma grafica
 * @author Napoleão Kazu Onaya
 */

public class Aula12 {
    
    public static void main(String[] args) {
        
        /**
         * Recuperação de dados com interface gráfica
         * JOptionPane
        */

        /**
         * Criando uma janela
        */

        String nome =  JOptionPane.showInputDialog("Qual o seu nome ?");

        JOptionPane.showMessageDialog(null,nome);

        System.out.println(nome);


    }
}
