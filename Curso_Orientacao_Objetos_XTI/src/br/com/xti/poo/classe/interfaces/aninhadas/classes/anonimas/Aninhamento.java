package br.com.xti.poo.classe.interfaces.aninhadas.classes.anonimas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aninhamento extends JFrame {
	
	JButton button;
	
	public class ListenerAninhado implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("Classe Aninhada executada: "+button.getText());
			
		}
		
	}
	
	public Aninhamento() {
		super("Aninhamento");
		
		button = new JButton("OK");
		button.addActionListener(new ListenerAninhado());
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				System.out.println("Classe Anônima executada: "+button.getText());
				
			}
		});
		
		getContentPane().add(BorderLayout.CENTER, button);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		Aninhamento janela = new Aninhamento();
		
		//Criado um classe aninhada
		Aninhamento.ListenerAninhado listener = janela.new ListenerAninhado();

	}

}
