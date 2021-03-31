/**
 * Classes Wrappers Primitivas
 * @author Napoleão Kazu Onaya
 */

public class Aula10 {
    
    public static void main(String[] args) {
        
        /**
         * Integer, Byte, Short, Long, Float, Double
         * Character, Void, Boolean
         * 
         * São classes que oferecem recursos de conversão
         */


         //int idade = 36;
         //double preco = 12.56;
         //char sexo = 'M';
         //boolean casado = true;

         //Criar um objeto usa a palavra chave new

         //Só funciona na versão 7 e 8 do java
         //Double preco = new Double("12.75")


         /** Versões mais atuais do java
          * (Boolean, Byte, Char, Short, Integer, Long, Float and Double)
          *
          * Construtor <WrapperType>.valueOf(<primitiveType>)
         */
         
         Integer idade = Integer.valueOf(36);
         
         int i = idade.intValue();

         System.out.println(i);

         Boolean check = Boolean.valueOf(true);

         boolean ativo = check.booleanValue();

         System.out.println(ativo);

         /**
          * Conversão estática de texto em valor
          * tipo nome = Wapper.parseWapper("String")
          */

          double d = Double.parseDouble("12.45");

          System.out.println(d);

          float f = Float.parseFloat("12.4567");

          System.out.println(f);


          //Conversão de string para binário
          int i2 = Integer.valueOf("101010",2);

          System.out.println(i2);

    }
}
