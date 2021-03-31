package br.com.xti.poo.tipos.de.excecoes.personalizadas;

/**
 * 
 *            Object SuperClasse
 *              |
 *            Throwable(Checked)
 *      |      												|
 * Exception(Checked)  ---  					 Error(Unchecked)
 * |                      |- SuaPropriaException 
 * |                      |-SQLException |-ClassNotFoundException |-IOException
 * RuntimeException
 * (Unchecked)
 * IllegalArgumentException - subclasse NumberFormatException
 * AritmeticException
 * IndexOutOfBoundsException -subclasse ArrayIndexOutOfBoundsException
 * ClassCastException
 * NullPointerException
 * NoSuchElementException - subclasse NumberFormatException
 * 
 * 
 * RuntimeException - Erros que devem ser tratados
 * 
 * Subclasses de IOException - EOFException | FileNotFoundException |UnknowHostException
 * 
 * Error - erros de falha na propria maquina virtual jvm
 * 
 * Todas as Exceções devem sempre extender de Exception
 * 
 * @author napoleao.kazu.onaya
 *
 */

public class TiposDeExcecoes {

}
