package br.com.xti.poo.gui.interfaces.graficas;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame implements ActionListener{
	
	JTextArea texto;

	public ControleTextArea() {
		super("Editor de Textos");
		
		texto = new JTextArea();
		JScrollPane scroll = new JScrollPane(texto);
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		
		Container c = getContentPane();
		
		JButton button = new JButton("Abrir arquivo");
		button.addActionListener(this);
		
		//This faz referencia a classe
		
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH, button);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ControleTextArea();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Abrir arquivo
		JFileChooser c = new JFileChooser();
		c.showOpenDialog(this);
		//Recuperar o arquivo
		File file = c.getSelectedFile();
		
		try {
			
			Path path = Paths.get(file.getAbsolutePath());
			String retorno = new String(Files.readAllBytes(path));
			texto.setText(retorno);
			
		}catch(Exception erro) {
			JOptionPane.showMessageDialog(this, "Não foi possivel abrir o arquivo!");
		}
		
	}
}
