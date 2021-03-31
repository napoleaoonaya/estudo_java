/**
 * break , continue e rotulos
 * 
 * @author Napoleão Kazu Onaya
 */

public class Aula40 {
    
    public static void main(String[] args) {
        
        while(true){
            System.out.println("Entrou!");
            break;
        }

        for(int i = 0; i<10; i++ ){
            if(i == 5){
                System.out.println(i);
                break;
            }
        }

        for(int i = 0; i<10; i++ ){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }

        //Rotulos
        boolean[][] matrix = {
            {false,true,false,false},
            {false,false,false,false}
        };

        buscaTrue:
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("A ");
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]){
                    System.out.print("TRUE");
                    break buscaTrue;
                }
                System.out.print("B ");
            }
        }



    }
}
