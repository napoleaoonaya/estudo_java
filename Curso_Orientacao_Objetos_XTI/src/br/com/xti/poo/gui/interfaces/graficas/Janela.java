package br.com.xti.poo.gui.interfaces.graficas;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {

	// Classe que representa uma janela
	public Janela() {
		
		//JFrame frame = new JFrame();
		
		super("Minha Janela");
		
		JButton button = new JButton(" Clique ");
		
		
//		frame.getContentPane().add(button);
//		
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setSize(300,300);
//		frame.setVisible(true);
		
		getContentPane().add(button);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Janela();
	}

}
