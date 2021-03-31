import java.util.Scanner;

/**
 * IMC = peso / (altura * altura)
 * cálcula o indice de massa corporal
 * @author Napoleão Kazu Onaya
 */

public class Aula20 {
    
    public static void main(String[] args) {
        
        System.out.println("Programa para calculo IMC");

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe seu peso: ");
        double peso = teclado.nextDouble();

        //Limpa a variavel para receber novo valor
        teclado.nextLine();

        System.out.println("Informe sua altura: ");
        String altura = teclado.nextLine();

        altura = altura.replaceAll(",", ".");
        double alturaCorreta = Double.parseDouble(altura);


        double imc = (peso / (alturaCorreta * alturaCorreta));

        System.out.println("-------------------Tabela-------------------");
        System.out.println("16 a 16,9 kg/m² - Muito abaixo do peso");
        System.out.println("17 a 18,4 kg/m² - Abaixo do peso"); 
        System.out.println("18,5 a 24,9 kg/m² - Peso normal");
        System.out.println("25 a 29,9 kg/m² - Acima do peso ");
        System.out.println("30 a 34,9 kg/m² - Obesidade grau I ");
        System.out.println("35 a 40 kg/m² - Obesidade grau II ");
        System.out.println("maior que 40 kg/m² - Obesidade grau III");
        System.out.println("---------------------------------------------");
        
        System.out.println("\n");


        //Foi adotado o if, else if, else, porque o switch não trabalha com número fracionado

        if(imc >= 16 && imc <= 16.9){
            System.out.println("Muito abaixo do peso");
            System.out.println("IMC: " + imc);
        }else if(imc >= 17 && imc <= 18.4){
            System.out.println("Abaixo do peso");
            System.out.println("IMC: " + imc);
        }else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
            System.out.println("IMC: " + imc);
        }else if(imc >= 25 && imc <= 29.9){
            System.out.println("Acima do peso");
            System.out.println("IMC: " + imc);
        }else if(imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau I");
            System.out.println("IMC: " + imc);
        }else if(imc >= 35 && imc <= 40){
            System.out.println("Obesidade grau II");
            System.out.println("IMC: " + imc);
        }else{
            System.out.println("Obesidade grau III");
            System.out.println("IMC: " + imc);
        }

    }

}
