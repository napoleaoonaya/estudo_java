import javax.swing.JOptionPane;

/**
 * Fluxo de condicional
 * 
 * if - else
 * 
 * @author Napoleão Kazu Onaya
 */

public class Aula27 {
    
    public static void main(String[] args) {

        String msg1 = "Temperatura ideal esta no intervalo de 0 a 100 graus Celcius";

        JOptionPane.showMessageDialog(null, msg1);
        
        String temperaturaFarenheit = JOptionPane.showInputDialog("Informe sua temperatura em grau Farenheit: ");

        double temperatura = Double.parseDouble(temperaturaFarenheit);

        double temperaturaCelsius = (((temperatura-32)/9)*5);

        if(temperaturaCelsius>=0 && temperaturaCelsius<=100){
            String msg = "Esta com a temperatura ideal";
            JOptionPane.showMessageDialog(null, msg);
        }else{
            String msg = "Esta com a temperatura ruim";
            JOptionPane.showMessageDialog(null, msg);
        }
        
        //O uso do if e else é melhor pois não tem problema de termos 
        //falha na excecução pois se a condição não entrar no if ela
        //cai no else ai encerra-se o programa

    }
}
