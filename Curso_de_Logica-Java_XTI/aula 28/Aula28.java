import javax.swing.JOptionPane;

/**
 * Fluxo de condicional
 * 
 * if - else if - else
 * 
 * @author Napoleão Kazu Onaya
 */

public class Aula28 {
    
    public static void main(String[] args) {
        
        String idadaTexto = JOptionPane.showInputDialog("Informe uma idade: ");

        int idade = Integer.parseInt(idadaTexto);

        if (idade>0 && idade<=10) {
         
            String msg = "Voce e uma crianca";
            JOptionPane.showMessageDialog(null,msg);

        }else if(idade>10 && idade<=17){

            String msg = "Voce e um adolescente";
            JOptionPane.showMessageDialog(null,msg);

        }else if(idade>17 && idade<=59){

            String msg = "Voce e um adulto";
            JOptionPane.showMessageDialog(null,msg);

        }else{

            String msg = "Voce e um adulto";
            JOptionPane.showMessageDialog(null,msg);

        }

        //Esse fluxo condicional é chamado de aninhado

    }
}
