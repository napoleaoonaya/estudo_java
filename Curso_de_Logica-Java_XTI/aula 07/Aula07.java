/**
 * Tipos primitivos em java
 * @author Napoleão Kazu Onaya
 */

public class Aula07 {
    
    public static void main(String[] args) {

        /**
         * Tipos primitivos 
         * 
         * Não é um objeto é apenas um valor
         * 
         * int, byte, short, long, float, double, char, void, boolean
         * 
         * int valor inteiro
         * short valor inteiro
         * long valor inteiro
         * double valor fracionado representado com ponto 10.50
         * char valor de um caracter ou letra
         * boolean dois valores true - 1 or false - 0
         * void inexistência de valor
         * float, double valores fracionados
         * 
         * char 16bit
         * byte 8bit
         * short 16bit
         * int 32bit
         * long 64bit
         * float 32bit
         * double 64bit
         * boolean 1bit
         * void sem valor
         * 
         * 
         */

         int idade = 31;
         double preco = 12.50;
         char sexo = 'M';
         byte b = 127;
         short s = 32_767;
         int i = 2_000_000_000;
         long l = 9_000_000_000_000_000_000L;
         //IEEE 754
         double d = 1.7976931348623157E+308;
         float f = 127F;

         /**
          * Sistema de número binário
          * byte bb = 0b01010101; 8bites
          * short ss = 0b0101010101010101; 16bits
          * int ii = 0b01010101010101010101010101010101; 32bits
          */

          int ii = 0b01010101010101010101010101010101;

          System.out.println(ii);

          /**
           * Conversão de valores Casting implicito
           * i = s;
           * short cabe dentro de um int
           * 
           * Conversão de valores Casting Explícito
           * i = l;
           * um long não cabe dentro de uma int
           *  
           * i = (int)l;
           *
           */

           i = (int) l;
           System.out.println(i);

        /**
        * Pesquisa por valores unicodes
         */

    }    
}
