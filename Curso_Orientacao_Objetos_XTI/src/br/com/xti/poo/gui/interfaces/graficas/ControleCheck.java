package br.com.xti.poo.gui.interfaces.graficas;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame {
	
	JTextField texto;
	JCheckBox bold, italico;

	public ControleCheck() {
		super("Controle Checks");
		
		texto = new JTextField("Veja a fonte mudar",12);
		texto.setFont(new Font("Serif", Font.PLAIN, 26));
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(texto);
		
		bold = new JCheckBox("Bold");
		bold.addItemListener(new CheckBoxListener());
		
		italico = new JCheckBox("Italic");
		italico.addItemListener(new CheckBoxListener());
		
		c.add(bold);
		c.add(italico);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new ControleCheck();
	}
	
	class CheckBoxListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if(bold.isSelected() && italico.isSelected()) {
				texto.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,20));
			}else if(bold.isSelected()) {
				texto.setFont(new Font("Serif",Font.BOLD,20));
			}else if(italico.isSelected()) {
				texto.setFont(new Font("Serif",Font.ITALIC,20));
			}else {
				texto.setFont(new Font("Serif",Font.PLAIN,20));
			}

			//System.out.println("Texto mudar");
		}
		
	}
	
}
