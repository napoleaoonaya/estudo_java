import java.util.Random;

/**
 * Baralho Lusofono
 */

public class Aula24 {
    
    public static void main(String[] args) {
        
        //Definido os arrays
        String[] faces = {"A","2","3","4","5","6","7","8","9","10","Valete","Dama","Rei"};
        String[] nipes = {"Espada","Paus","Copas","Ouros"};

        //Usando a classe Random
        Random r = new Random();

        //Definido um valor aleatório de indice de face
        int indiceFace = r.nextInt(faces.length);
        //Atribuindo um valor direto na face
        String face = faces[indiceFace];

        //Definindo e atribuindo um valor diretamente
        String nipe = nipes[r.nextInt(nipes.length)];

        System.out.println(face+" "+nipe);

    }
}
