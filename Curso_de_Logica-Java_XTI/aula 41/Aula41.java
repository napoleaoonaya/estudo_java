/**
 * Recurso auxiliar das classes Wrapper
 * 
 * autoboxing
 * 
 * boxing encaixotar
 * 
 * unboxing desencaixotar
 * 
 * java 5
 * 
 * @author Napoleão Kazu Onaya
 */

public class Aula41 {
    
    public static void main(String[] args) {
        
        /* Só funciona no java 5 e 6
        Integer x = new Integer(51);//empacotar
        int a = x.intValue();//desempacotar
        a++;//incrementar
        x = new Integer(a);//re-empacotar
        System.out.println(x.intValue());
        */

        Integer x = 555;
        x++;//desempacotando, incrementando, re-empacotando
        System.out.println(x);

        //x.intValue();

        Boolean v = true;

        if(v){
            System.out.println(v);
        }

    }
}
