package br.com.xti.poo.gui.interfaces.graficas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame {

	// Classe que representa uma janela
	
	public Layouts2() {
		
		//JFrame frame = new JFrame();
		
		super("Layouts");
		
		//Recuperar um container e atribuir a uma variavel, com layout padrão
//		Container c = getContentPane();
	
		//BorderLayout
//		c.setLayout(new BorderLayout(15,5));
//		c.add(BorderLayout.NORTH, new JButton("N"));
//		c.add(BorderLayout.WEST, new JButton("O"));
//		c.add(BorderLayout.CENTER, new JButton("C"));
//		c.add(BorderLayout.EAST, new JButton("L"));
//		c.add(BorderLayout.SOUTH, new JButton("S"));
		
		//GridLayout
//		c.setLayout(new GridLayout(2,3));
//		c.add(new JButton("1"));
//		c.add(new JButton("2"));
//		c.add(new JButton("3"));
//		c.add(new JButton("4"));
//		c.add(new JButton("5"));
//		c.add(new JButton("6"));
		
		//Dois Layouts ao mesmo tempo
		
		//Principal
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//Secundario
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("OK"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup"));
		c2.add(new JButton("Help"));
		
		//Layout centro
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		//Layout a leste
		c.add(BorderLayout.EAST, c2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Layouts2();
	}

}
