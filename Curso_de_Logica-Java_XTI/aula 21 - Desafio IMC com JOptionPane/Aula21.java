import javax.swing.JOptionPane;

public class Aula21 {
    
    public static void main(String[] args) {
        
        //Entrada de dados como String
        String peso = JOptionPane.showInputDialog("Informe seu peso em kilogramas");
        
        //Convertendo um String para Double
        double pesoConvertido = Double.parseDouble(peso);    

        //Entrada de dados como String
        String altura = JOptionPane.showInputDialog("Informe sua altura em metro e centimetros");

        //Previne erros de caracter pois double trabalha com ponto, e não com vírgula!!, por isso usa
        //a função replaceAll(regex,replacement)
        //regex entra aqui uma expressão regular
        //replacement troca por um valor dentro de String
        altura = altura.replaceAll(",", ".");

        //Convertendo um String para Double
        double alturaCorrigida = Double.parseDouble(altura);

        //Cálculando o IMC
        double imc = (pesoConvertido/(alturaCorrigida*alturaCorrigida));

        //Tabela de IMC e respectivos valores
        //Definindo variaveis de mensagens
        String msgTitulo = " Tabela de IMC ";
        String msgRef1 = "16 a 16,9 kg/m² - Muito abaixo do peso";
        String msgRef2 = "17 a 18,4 kg/m² - Abaixo do peso"; 
        String msgRef3 = "18,5 a 24,9 kg/m² - Peso normal";
        String msgRef4 = "25 a 29,9 kg/m² - Acima do peso ";
        String msgRef5 = "30 a 34,9 kg/m² - Obesidade grau I ";
        String msgRef6 = "35 a 40 kg/m² - Obesidade grau II ";
        String msgRef7 = "maior que 40 kg/m² - Obesidade grau III";
        
        //Concatenando mensagems
        String msgTabelaImc = msgTitulo + "\n" + msgRef1 + "\n" + msgRef2 
        + "\n" + msgRef3 + "\n" + msgRef4 
        + "\n" + msgRef5 + "\n" + msgRef6 
        + "\n" + msgRef7;

        //Cria o dialog da Tabela
        JOptionPane.showMessageDialog(null, msgTabelaImc);

        //Foi adotado o if, else if, else, porque o switch não trabalha com número fracionado
        if(imc >= 16 && imc <= 16.9){
            
            //Definindo variaveis de mensagens
            String msg1 = "Muito abaixo do peso";
            String msg2 = "IMC: " + imc;
            //Concatenando mensagems
            String msg = msg1 + "\n" + msg2;

            //Cria o dialog Resultado IMC
            JOptionPane.showMessageDialog(null, msg);
            
        }else if(imc >= 17 && imc <= 18.4){
            
            //Definindo variaveis de mensagens
            String msg1 = "Abaixo do peso";
            String msg2 = "IMC: " + imc;
            //Concatenando mensagems
            String msg = msg1 + "\n" + msg2;

            //Cria o dialog Resultado IMC
            JOptionPane.showMessageDialog(null, msg);

        }else if(imc >= 18.5 && imc <= 24.9){
            
            //Definindo variaveis de mensagens
            String msg1 = "Peso normal";
            String msg2 = "IMC: " + imc;
            //Concatenando mensagems
            String msg = msg1 + "\n" + msg2;

            //Cria o dialog Resultado IMC
            JOptionPane.showMessageDialog(null, msg);

        }else if(imc >= 25 && imc <= 29.9){

            //Definindo variaveis de mensagens
            String msg1 = "Acima do peso";
            String msg2 = "IMC: " + imc;
            //Concatenando mensagems
            String msg = msg1 + "\n" + msg2;

            //Cria o dialog Resultado IMC
            JOptionPane.showMessageDialog(null, msg);
            
        }else if(imc >= 30 && imc <= 34.9){
            
            //Definindo variaveis de mensagens
            String msg1 = "Obesidade grau I";
            String msg2 = "IMC: " + imc;
            //Concatenando mensagems
            String msg = msg1 + "\n" + msg2;

            //Cria o dialog Resultado IMC
            JOptionPane.showMessageDialog(null, msg);

        }else if(imc >= 35 && imc <= 40){
            
            //Definindo variaveis de mensagens
            String msg1 = "Obesidade grau II";
            String msg2 = "IMC: " + imc;
            //Concatenando mensagems
            String msg = msg1 + "\n" + msg2;

            //Cria o dialog Resultado IMC
            JOptionPane.showMessageDialog(null, msg);

        }else{
            
            //Definindo variaveis de mensagens
            String msg1 = "Obesidade grau III";
            String msg2 = "IMC: " + imc;
            //Concatenando mensagems
            String msg = msg1 + "\n" + msg2;

            //Cria o dialog Resultado IMC
            JOptionPane.showMessageDialog(null, msg);

        }
    
    }
}
