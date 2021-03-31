package br.com.xti.poo.gui.interfaces.graficas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {

	// Classe que representa uma janela
	public Layouts() {
		
		//JFrame frame = new JFrame();
		
		super("Layouts");
		
		//Recuperar um container e atribuir a uma variavel, com layout padrão
		Container c = getContentPane();
		
		/**
		 * BorderLayout
		 * 
		 * nort,swest,center,east,south
		 * 
		 */
		
//		BorderLayout border = new BorderLayout();
//		c.setLayout(border);
		
		c.setLayout(new FlowLayout());
		
		
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER, new JButton("3"));
		c.add(BorderLayout.WEST, new JButton("4"));
		c.add(BorderLayout.EAST, new JButton("5"));
		
		
		
		//Elementos adicionando controles
		//getContentPane().add(new JButton("1"));
		//getContentPane().add(new JButton("2"));
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Layouts();
	}

}
