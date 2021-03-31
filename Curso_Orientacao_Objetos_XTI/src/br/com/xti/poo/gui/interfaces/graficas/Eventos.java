package br.com.xti.poo.gui.interfaces.graficas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener{

	JButton button;
	
	public Eventos() {
		
		super("Eventos");
		
		button = new JButton("Clique aqui");
		
		button.addActionListener(this);
		
		getContentPane().add(button);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Eventos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Clicou");
		button.setText("Foi Clicado!");
	}

}
