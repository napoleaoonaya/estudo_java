import javax.swing.JOptionPane;

/**
 * Estrutura de controle 
 * 
 * switch
 * 
 * @author Napoleão Kazu Onaya
 */

public class Aula30 {

    public static void main(String[] args) {
        
        String sexo = JOptionPane.showInputDialog("Informe o sexo M ou F");
        
        switch (sexo) {
            case "M":
                String msg1 = "Sexo masculino";
                JOptionPane.showMessageDialog(null,msg1);
                break;
            case "F":
                String msg2 = "Sexo masculino";  
                JOptionPane.showMessageDialog(null,msg2);
                break;
            default:
                String msg3 = "Fora da opcao";  
                JOptionPane.showMessageDialog(null,msg3);
                break;
        }
    }
    
}
