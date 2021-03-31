/**
 * Operadores Matemáticos
 * +, -, *, /, %, ++, --
 * @author Napoleão Kazu Onaya
 */

public class Aula14 {
    
    public static void main(String[] args) {
        

        int x = 7 / 3;
        int y = 12 * 5;
        int z = 3 + 1;
        int w = 3 - 1;
        int t = 10%2;

        System.out.println("Operadores Matemáticos");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
        System.out.println(t);
        
        System.out.println("-------------------------------------------");

        /**Como saber se um número é par ou impar
         *Basta cálcular seu módulo pois se o módulo for zero é par, 
         *se o módulo for diferente de zero é impar
        */  
        if(t==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
        
        System.out.println("-------------------------------------------");

        double q = +4;
        //Menos muda o sinal do operador para menos -
        double p = -5; 

        System.out.println(q);
        System.out.println(p);

        System.out.println("-------------------------------------------");

        int n = 23;
        // ++n equivale a n = n + 1
        // n = 23
        // n = 23 + 1
        // n = 24
        System.out.println(n);
        int m = ++n;
        System.out.println(m);


    }
}
