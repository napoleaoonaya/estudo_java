import javax.swing.JOptionPane;

/**
 * Estrutura de controle avançada
 * 
 * switch
 * 
 * @author Napoleão Kazu Oanya
 */

public class Aula31 {
    
    public static void main(String[] args) {

        String tecnologia = JOptionPane.showInputDialog("Informe sua tecnologia: ");
        
        switch (tecnologia) {
            case "java":
            case "c#":
            case "python":
            case "cobol":
            case "ruby":
            case "lua":
            case "c++":
                String msg1 = "Linguagem de programacao";
                JOptionPane.showMessageDialog(null,msg1);    
                break;
            case "sql server":
            case "mysql":
            case "postgresql":
            case "db2":
            case "oracle":
                String msg2 = "Banco de dados";
                JOptionPane.showMessageDialog(null,msg2);    
                break;
            default:
                String msg3 = "Tecnologia desconhecida";
                JOptionPane.showMessageDialog(null,msg3);    
                break;
        }

        /**
         * O switch é usado para avaliar escolhas simples 
         */

    }
}
