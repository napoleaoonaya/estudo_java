package br.com.xti.poo.gui.interfaces.graficas;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Controles extends JFrame {

	private static final long serialVersionUID = 1L;

	public Controles() {
		
		super("Controles e Label");
		
		JLabel simples = new JLabel("Label simples");
		simples.setToolTipText("Meu Tooltip");
		
		ImageIcon icon = new ImageIcon(getClass().getResource("imagens/lampada.jpg"));
		JLabel imagem = new JLabel(icon);
		
		
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28);
		JLabel label = new JLabel("Label Simples");
		label.setFont(fonte);
		label.setForeground(Color.BLUE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples);
		c.add(label);
		c.add(imagem);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Controles();
	}

}
