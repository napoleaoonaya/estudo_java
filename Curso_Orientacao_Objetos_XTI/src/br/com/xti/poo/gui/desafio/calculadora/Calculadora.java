package br.com.xti.poo.gui.desafio.calculadora;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	public Calculadora() {
		
		super("Cálculadora");
		
		JTextField campoDigitado = new JTextField();
		campoDigitado.setFont(new Font("serif", Font.PLAIN, 46));
		
		//Botões de operação
		JButton divisao = new JButton("/");
		JButton multiplicacao = new JButton("*");
		JButton subtracao = new JButton("-");
		JButton soma = new JButton("+");
		
		//Botões de números
		JButton nove = new JButton("9");
		JButton oito = new JButton("8");
		JButton sete = new JButton("7");
		JButton seis = new JButton("6");
		JButton cinco = new JButton("5");
		JButton quatro = new JButton("4");
		JButton tres = new JButton("3");
		JButton dois = new JButton("2");
		JButton um = new JButton("1");
		JButton zero = new JButton("0");
		
		//Caracter
		JButton ponto = new JButton(".");
		JButton igual = new JButton("=");
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		
		Container d = new JPanel();
		d.setLayout(new GridLayout(4,4));
		
		d.add(sete);
		d.add(oito);
		d.add(nove);
		d.add(divisao);
		d.add(quatro);
		d.add(cinco);
		d.add(seis);
		d.add(multiplicacao);
		d.add(um);
		d.add(dois);
		d.add(tres);
		d.add(subtracao);
		d.add(zero);
		d.add(ponto);
		d.add(igual);
		d.add(soma);
		
		
		c.add(BorderLayout.NORTH, campoDigitado);
		c.add(BorderLayout.CENTER, d);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		new Calculadora();
	}

}
