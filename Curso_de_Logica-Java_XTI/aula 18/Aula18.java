import java.util.Scanner;

/**
 * Operadores especiais
 * @author Napoleão Kazu Onaya
 */

public class Aula18 {
    
    public static void main(String[] args) {
        
        /**
         * Operadores de bits
         * &, |, ^, ~, <<=
         * &=, |=, ^|, >>=, >>>=
         * Estudar junto com algebra booleana
         */

        /**
         * Operadores especiais
         * térnario, separação de expressões, chamada, coerção unária
         * ? :, ,, (), (cast)
         */

        //Ternário
        int idade = 18;
        System.out.println((idade>=18) ? "Maior de idade": "Menor de idade");
        String resultado = ((idade>=18) ? "Maior de idade": "Menor de idade");
        System.out.println(resultado);

        //Separação
        String nome = "Napoleão", sobreNome = "Onaya";
        System.out.println(nome + " - " + sobreNome);


        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o raio: ");
        double raio = (teclado.nextDouble());

        //Diametro é 2 * r
        double diametro = 2 * raio;
        System.out.println("Diametro: " + diametro);

        //Circunferência 2 * PI * r
        double circunferencia = (2 * Math.PI * raio);
        System.out.println("Circunferencia: " + circunferencia);

        //Area do circulo PI * r ^ 2
        double area = (Math.PI * raio * raio);
        System.out.println("Area: " + area);



    }
}
