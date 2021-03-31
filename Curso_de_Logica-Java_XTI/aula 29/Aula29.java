/**
 * Fluxo condicional aninhado
 * 
 * if - else
 * 
 * @author Napoleão Kazu Oanay
 */

public class Aula29 {
    
    public static void main(String[] args) {
        
        int nota = 6;

        if (nota >= 7) {
            System.out.println("Passou de ano");
        } else {
            System.out.println("Reprovou");
            if (nota == 6) {
                System.out.println("Mas, pode fazer a prova de recuperacao");
            }
        }

    }
}
